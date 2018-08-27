package org.leanpoker.player;

import com.google.gson.*;
import org.leanpoker.Model.Card;
import org.leanpoker.Model.OtherPlayer;
import org.leanpoker.Utility.JsonMapper;

import java.util.List;
import java.lang.reflect.Array;
import java.util.Map;

public class Player {



    static final String VERSION = "Istvan Az asztalnal 0.4.6";


    public static JsonMapper jsonMapper = new JsonMapper();


    public static int betRequest(JsonElement request) {
        int stack = 0;
        Card firstCard = new Card();
        Card secondCard = new Card();
        if (request.isJsonArray()) {
            try {
                System.out.println("ARRAY_START");
                System.out.println(request.getAsJsonArray());
                System.out.println("ARRAY_END");
            } catch (Exception e) {
                System.out.println("ARRAY PRINT FAILED");
            }


        } else if (request.isJsonObject()) {
            try {
                System.out.println("OBJECT_START");
                System.out.println(request.getAsJsonObject());
                System.out.println("OBJECTEND");
                System.out.println("istvan_object: " + request.getAsJsonObject().get("players").getAsJsonArray());

                stack = jsonMapper.getPlayerStack(request);
                System.out.println("EZ ITT A STACK: " + stack);
                List<Card>cardList = jsonMapper.getHoleCards(request);
                System.out.println(cardList.get(0).getRank()+", "+cardList.get(1).getRank());
                firstCard.setRank(cardList.get(0).getRank());
                firstCard.setSuit(cardList.get(0).getSuit());
                secondCard.setRank(cardList.get(1).getRank());
                secondCard.setSuit(cardList.get(1).getSuit());
                System.out.println(firstCard.getRank()+", "+secondCard.getRank());
               /* if(firstCard.getRank().equals("10")||firstCard.getRank().equals("K")||firstCard.getRank().equals("A")||firstCard.getRank().equals("Q")||firstCard.getRank().equals("J")&& secondCard.getRank().equals("A")||secondCard.getRank().equals("K")||secondCard.getRank().equals("Q")||secondCard.getRank().equals("J")||secondCard.getRank().equals("10")){
                    return stack;
                }*/
                    /*List<OtherPlayer> players = jsonMapper.getPlayersFromJson(request);
                    System.out.println("Player's List size: "+ players.size());
                    List<Card> hand_cards = jsonMapper.jsonAsCardObject(request);
                    System.out.println("hand size: " + hand_cards.size());*/
            } catch (Exception e) {
                System.out.println("OBJECT PRINT FAILED " + "This is the Exception: " + e.getMessage());
                e.printStackTrace();
            }

        } else if (request.isJsonPrimitive()) {

            System.out.println(request.getAsJsonPrimitive());
            System.out.println("PRIMITIVE");

        } else {
            request.getAsJsonNull();

        }

        return stack;
    }

    public static void showdown(JsonElement game) {
    }
}
