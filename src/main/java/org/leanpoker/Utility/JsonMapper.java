package org.leanpoker.Utility;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.leanpoker.Model.Card;
import org.leanpoker.Model.OtherPlayer;

import java.util.ArrayList;
import java.util.List;

public class JsonMapper {

    public List<Card> jsonAsCardObject(JsonElement request) {
        JsonArray cardsJson = request.getAsJsonObject().get("community_cards").getAsJsonArray();
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


}



