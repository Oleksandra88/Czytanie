package pl.saltsoft;

import com.google.gson.Gson;

public class Serializer {

    private Gson gson;

    void serialize (Koty koty) {

        Gson gson = new Gson();
        String json = gson.toJson(koty);
        System.out.println(json);
    }

    Koty deserialize (String json) {
        Gson gson = new Gson();

        Koty kotyAgain = gson.fromJson(json, Koty.class);
        return kotyAgain;
    }
}
