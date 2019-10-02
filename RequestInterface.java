package com.example.squarephotovideoeditor.adapter;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RequestInterface {
    @POST("V1sudhkbela09hkdha2019s/")
    @Multipart
    Call<MyPojo> uploadUserData(@Part("Op") RequestBody op,
                                @Part("DeviceType") RequestBody devicetype,
                                @Part("UserId") RequestBody userid,
                                @Part MultipartBody.Part files);


}
