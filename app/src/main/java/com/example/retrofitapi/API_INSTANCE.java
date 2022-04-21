package com.example.retrofitapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API_INSTANCE {

    public static String baseurl = "https://jsonplaceholder.typicode.com/";

    public static Api_Interface CallApi()
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api_Interface service = retrofit.create(Api_Interface.class);

        return service;

    }

}
