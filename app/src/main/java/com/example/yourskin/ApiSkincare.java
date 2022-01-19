package com.example.yourskin;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiSkincare {
    public static final String URL = "http://172.20.10.6/fetch/";
    public static Retrofit retrofit;

    public static Retrofit getApiSkincare(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
