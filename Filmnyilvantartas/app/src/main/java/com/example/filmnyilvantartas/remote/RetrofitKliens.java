package com.example.filmnyilvantartas.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitKliens {
    private static Retrofit retrofit;
    public  static Retrofit getClient(String url){
        if(retrofit==null){
            retrofit= new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
