package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.leanpoker.Model.Card;
import org.leanpoker.Model.OtherPlayer;
import org.leanpoker.Utility.JsonMapper;

import java.util.List;
import java.lang.reflect.Array;
import java.util.Map;

public class Player {


    static final String VERSION = "Istvan Az asztalnal 0.3.2";

    public static JsonMapper jsonMapper;


    public static int betRequest(JsonElement request) {
            if(request.isJsonArray()){
                try {
                    System.out.println("ARRAY_START");
                    System.out.println(request.getAsJsonArray());
                    System.out.println("ARRAY_END");
                } catch (Exception e) {
                    System.out.println("ARRAY PRINT FAILED");
                }


            }else if(request.isJsonObject()){
                try {
                    System.out.println("OBJECT_START");
                    System.out.println(request.getAsJsonObject());
                    System.out.println("OBJECTEND");
                    System.out.println("istvan_object: " + request.getAsJsonObject().get("players").getAsJsonArray());
                    JsonArray playersElement = request.getAsJsonObject().get("players").getAsJsonArray();
                    int stack = jsonMapper.getPlayerStack(request);
                    System.out.println("EZ ITT A STACK: " +stack);
                    /*List<OtherPlayer> players = jsonMapper.getPlayersFromJson(request);
                    System.out.println("Player's List size: "+ players.size());
                    List<Card> hand_cards = jsonMapper.jsonAsCardObject(request);
                    System.out.println("hand size: " + hand_cards.size());*/
                } catch (Exception e) {
                    System.out.println("OBJECT PRINT FAILED " +"This is the Exception: "+e.getMessage());
                }

            }else if(request.isJsonPrimitive()){

                System.out.println(request.getAsJsonPrimitive());
                System.out.println("PRIMITIVE");

            }else{
                request.getAsJsonNull();

            }

       return  953;
    }

    public static void showdown(JsonElement game) {
    }
}
