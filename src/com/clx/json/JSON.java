package com.clx.json;

import com.google.gson.*;

import java.io.*;
import java.util.Set;

public class JSON {
    static String jsonTotal = "";
    public static String readJson() throws IOException {
        JsonParser parser = new JsonParser();
        FileReader fileReader = new FileReader("D:\\Mywork\\TunersRookie\\activity.json");

        JsonObject root = (JsonObject) parser.parse(fileReader);

        JsonArray firstArray = (JsonArray) root.get("first_five");
        ergodicJsonArray(firstArray, firstArray);

        JsonArray secondArray = (JsonArray) root.get("second_five");
        ergodicJsonArray(firstArray, secondArray);

        fileReader.close();
        return jsonTotal;
    }

    private static void ergodicJsonArray(JsonArray firstArray, JsonArray secondArray) {
        for (int i = 0; i < secondArray.size(); i++) {
            JsonObject jsonObject = (JsonObject) firstArray.get(i);
            Set<String> jsonKey = jsonObject.keySet();
            for (String name: jsonKey) {
                jsonTotal += judgeType(name) + ":" + jsonObject.get(name).toString().substring(1, jsonObject.get(name).toString().length() - 1) + "\n";
                System.out.println(judgeType(name) + ":" + jsonObject.get(name).toString().substring(1,jsonObject.get(name).toString().length() - 1));
            }
            System.out.println();
            jsonTotal += "\n";
        }
    }

    private static String  judgeType(String name) {
        switch (name) {
            case "name":
                return "姓名";
            case "avatar":
                return "头像";
            case "action":
                return "行为";
            case "time":
                return "时间";
            case "icon":
                return "图标";
            default:
                return "";
        }
    }
}