package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonInputParser {
    private static JSONObject userData;

    public static JSONObject inputData() {
        JSONParser parser = new JSONParser();
        try {
            userData = (JSONObject) parser.parse(new FileReader("src/test/resources/TestData.json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userData;
    }

    public static void main(String[] args) {
        inputData();
    }
}

