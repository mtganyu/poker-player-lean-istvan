package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.lang.reflect.Array;
import java.util.Map;

public class Player {


    static final String VERSION = "Istvan Az asztalnal 0.2.8";


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
                    JsonArray players = request.getAsJsonObject().get("players").getAsJsonArray();
                    for(JsonElement element : players) {
                        System.out.println("ELEMENT: " + element);
                    }
                } catch (Exception e) {
                    System.out.println("OBJECT PRINT FAILED");
                }

            }else if(request.isJsonPrimitive()){

                System.out.println(request.getAsJsonPrimitive());
                System.out.println("PRIMITIVE");

            }else{
                request.getAsJsonNull();

            }

       return  950;
    }

    public static void showdown(JsonElement game) {
    }
}
