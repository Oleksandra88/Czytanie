package pl.saltsoft;

import com.google.gson.Gson;

public class Serializer {

    void serialize () {
        Koty koty = new Koty();
        Gson gson = new Gson();
        String json = gson.toJson(koty);

    }

    void deserialize () {

    }
}
