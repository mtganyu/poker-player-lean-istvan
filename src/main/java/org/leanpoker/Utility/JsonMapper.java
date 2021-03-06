package org.leanpoker.Utility;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.leanpoker.Model.Card;
import org.leanpoker.Model.GameState;
import org.leanpoker.Model.OtherPlayer;

import java.util.ArrayList;
import java.util.List;

public class JsonMapper {

    public List<Card> getHoleCards(JsonElement request) {

        JsonArray cardsJson = returnPlayer(request).get("hole_cards").getAsJsonArray();
        List<Card> cards = new ArrayList();
        for (JsonElement cardJson : cardsJson) {
            JsonObject cardObject = cardJson.getAsJsonObject();
            cards.add(new Card(cardObject.get("rank").getAsString(), cardObject.get("suit").getAsString()));
        }
        return cards;

    }

    public List<OtherPlayer> getPlayersFromJson(JsonElement request) {
        JsonArray playersJson = request.getAsJsonObject().get("players").getAsJsonArray();
        List<OtherPlayer> otherPlayers = new ArrayList<>();
        for (JsonElement otherPlayerElement : playersJson) {
            JsonObject otherJsonObj = otherPlayerElement.getAsJsonObject();
            otherPlayers.add(new OtherPlayer(otherJsonObj.get("id").getAsInt(),
                    otherJsonObj.get("stack").getAsInt(), otherJsonObj.get("bet").getAsInt(),
                    otherJsonObj.get("name").getAsString(), otherJsonObj.get("status").getAsString(),
                    otherJsonObj.get("version").getAsString()));
        }
        return otherPlayers;
    }

    public int getPlayerStack(JsonElement request) {
        JsonArray players = request.getAsJsonObject().getAsJsonArray("players");
        JsonObject player = null;
        int result = 0;
        for (int i = 0; i < players.size(); i++) {
            JsonElement element = players.get(i);
            JsonObject pl = element.getAsJsonObject();
            if (pl.get("name").getAsString().equals("Lean Istvan")) {
                player = pl;
                result = pl.get("stack").getAsInt();
            }
        }
        System.out.println("pisti=" + player);
        System.out.println("PENZ: " + result);
        /*JsonObject players = request.getAsJsonObject().get("players").getAsJsonObject();
        JsonArray jsonArray = players.getAsJsonArray();
        System.out.println(jsonArray.size()+"EZ ITT A JSON ARRAY HOSSZA");
        System.out.println("PLAYER ELKESZULT");
        int result = 0;
        for(JsonElement playerJson : jsonArray) {
            System.out.println("FOR ALATT");
            JsonObject playerObj = playerJson.getAsJsonObject();
            System.out.println("OBJECT ELKESZULT");
            if(playerObj.get("name").equals("Lean Istvan")) {
                System.out.println("IF ALATT");
                result = playerObj.get("stack").getAsInt();
                System.out.println("RESULT MEGVAN");
            }
        }*/
        return result;
    }

    // work in progress
    public GameState getGameState(JsonElement request) {
        List<OtherPlayer> otherPlayers = getPlayersFromJson(request);
        List<Card> holeCards = getHoleCards(request);
        List<Card> communityCards = getCommunityCards(request);
        JsonObject stats = request.getAsJsonObject();

        return new GameState(stats.get("tournament_id").getAsString(),
                stats.get("game_id").getAsString(),
                stats.get("round").getAsInt(), stats.get("bet_index").getAsInt(),
                stats.get("small_blind").getAsInt(), stats.get("current_buy_in").getAsInt(),
                stats.get("pot").getAsInt(), stats.get("minimum_raise").getAsInt(),
                stats.get("dealer").getAsInt(), stats.get("orbits").getAsInt(),
                stats.get("in_action").getAsInt(),
                otherPlayers, communityCards);
    }

    private List<Card> getCommunityCards(JsonElement request) {
        JsonArray cardsJson = request.getAsJsonObject().get("community_cards").getAsJsonArray();
        List<Card> cards = new ArrayList();
        for (JsonElement cardJson : cardsJson) {
            JsonObject cardObject = cardJson.getAsJsonObject();
            cards.add(new Card(cardObject.get("rank").getAsString(), cardObject.get("suit").getAsString()));
        }
        return cards;
    }

    private JsonObject returnPlayer(JsonElement request) {
        JsonArray players = request.getAsJsonObject().getAsJsonArray("players");
        JsonObject player = null;
        int result = 0;
        for (int i = 0; i < players.size(); i++) {
            JsonElement element = players.get(i);
            JsonObject pl = element.getAsJsonObject();
            if (pl.get("name").getAsString().equals("Lean Istvan")) {
                player = pl;
            }
        }
        return player;
    }


}



