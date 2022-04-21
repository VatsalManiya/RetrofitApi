package com.example.retrofitapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview=findViewById(R.id.recview);


        API_INSTANCE.CallApi().createuser().enqueue(new Callback<List<FakePosts>>() {
            @Override
            public void onResponse(Call<List<FakePosts>> call, Response<List<FakePosts>> response) {


                ArrayList<FakePosts> listpost = new ArrayList<>(response.body());

                PostAdapter postAdapter = new PostAdapter(MainActivity.this,listpost);
                recview.setAdapter(postAdapter);

            }

            @Override
            public void onFailure(Call<List<FakePosts>> call, Throwable t) {


            }
        });




    }
}