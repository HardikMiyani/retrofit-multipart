package com.example.squarephotovideoeditor.adapter;


import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;
//    private static String Base_URl = "http://159.65.152.16/photobox/api/";
    private static String Base_URl = "http://nextgenbuddy.com/Shotgun/shotgun-web/api/";
    private static Gson gson = new GsonBuilder().setLenient().create();

    public static Retrofit getClient(Context context) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.NONE);

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.MINUTES)
                .readTimeout(20, TimeUnit.MINUTES)
                .writeTimeout(20, TimeUnit.MINUTES)
                .retryOnConnectionFailure(true)
                .addInterceptor(logging)
                .build();



        return new Retrofit.Builder()
                .baseUrl(Base_URl)
                .addConverterFactory(GsonConverterFactory.create(gson))
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(httpClient)
                .build();
    }
}
