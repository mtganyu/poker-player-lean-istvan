package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.Map;

public class Player {

    static final String VERSION = "Istvan Az asztalnal 0.2";

    public static int betRequest(JsonElement request) {
            if(request.isJsonArray()){

                System.out.println(request.getAsJsonArray());
                System.out.println("ARRAY");
            }else if(request.isJsonObject()){

                System.out.println(request.getAsJsonObject());
                System.out.println("OBJECT");
            }else if(request.isJsonPrimitive()){

                System.out.println(request.getAsJsonPrimitive());
                System.out.println("PRIMITIVE");

            }else{
                request.getAsJsonNull();

            }

       return  800;
    }

    public static void showdown(JsonElement game) {
    }
}
