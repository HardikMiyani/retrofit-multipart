package com.example.squarephotovideoeditor.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.squarephotovideoeditor.R;
import com.example.squarephotovideoeditor.adapter.ApiClient;
import com.example.squarephotovideoeditor.adapter.MyPojo;
import com.example.squarephotovideoeditor.adapter.RequestInterface;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FileUploadActivity extends AppCompatActivity {


    Button imageView;
    private RequestInterface mRequestInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_upload);

        mRequestInterface = ApiClient.getClient(getApplicationContext()).create(RequestInterface.class);
        File file = new File("/storage/emulated/0/CropPhoto/Images/20190930_192206.png");
        if (file.exists()) {
            Log.e("create", "onCreate:exist ");
        } else {
            Log.e("create", "onCreate: not exist ");
        }


        imageView = findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadImage();
            }
        });

    }

    private void uploadImage() {

        RequestBody Op = createPartFromString("update_user");
        RequestBody DeviceType = createPartFromString("1");
        RequestBody UserId = createPartFromString("1");

        MultipartBody.Part file = prepareFilePart("ProfilePic", "/storage/emulated/0/CropPhoto/Images/20190930_192206.png");
        Call<MyPojo> call = mRequestInterface.uploadUserData(Op, DeviceType, UserId, file);
        call.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {

                Log.e("onResponse: ", "onResponse: ");

                if (response.isSuccessful()) {
                    Log.e("onResponse: ", "onResponse: " + response);
                    Log.e("onResponse: ", "onResponse: " + response.body().getData());
                }


            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {

                Log.e("onFailure: ", "onFailure: " + t.getMessage());

            }
        });


    }

    @NonNull
    private MultipartBody.Part prepareFilePart(String partName, String filePath) {
        File file = new File(filePath);
        RequestBody requestFile = RequestBody.create(MediaType.parse("image/*"), file);
        return MultipartBody.Part.createFormData(partName, file.getName(), requestFile);
    }

    @NonNull
    private RequestBody createPartFromString(String string) {
        return RequestBody.create(MultipartBody.FORM, string);
    }
}
