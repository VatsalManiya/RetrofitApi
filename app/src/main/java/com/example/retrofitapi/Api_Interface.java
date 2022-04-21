package com.example.retrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_Interface {


    @GET("posts")
    Call<List<FakePosts>> createuser();
}
