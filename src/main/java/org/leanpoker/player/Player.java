package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Istvan Az asztalnal";

    public static int betRequest(JsonElement request) {

        String cards =  request.getAsString();
        System.out.println("ITT VAGYOK");
        System.out.println(cards);
        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
