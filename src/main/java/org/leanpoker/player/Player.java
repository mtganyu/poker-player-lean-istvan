package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.Map;

public class Player {


    static final String VERSION = "Istvan Az asztalnal 0.2.6";


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
                    System.out.println("istvan_object: " + request.getAsJsonObject().get("players").getAsJsonObject().get("Lean Istvan").getAsJsonObject().get("stack"));
                } catch (Exception e) {
                    System.out.println("OBJECT PRINT FAILED");
                }

            }else if(request.isJsonPrimitive()){

                System.out.println(request.getAsJsonPrimitive());
                System.out.println("PRIMITIVE");

            }else{
                request.getAsJsonNull();

            }

       return  942;
    }

    public static void showdown(JsonElement game) {
    }
}
