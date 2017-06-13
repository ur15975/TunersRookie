package com.clx.json;

import com.google.gson.*;

import java.io.*;

public class JSONOutput {
    public static void main(String[] args) throws IOException {
        setElement("fdsa", "fdsa", "fdsa", "fdsa");
    }

    public static void setElement(
            String name, String avatar, String action, String time) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("avatar", avatar);
        jsonObject.addProperty("action", action);
        jsonObject.addProperty("time", time);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(jsonObject.toString());
        System.out.println(gson.toJson(jsonElement));

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\123.json");
        fileOutputStream.write(jsonElement.toString().getBytes("UTF-8"));
        fileOutputStream.close();


    }
}