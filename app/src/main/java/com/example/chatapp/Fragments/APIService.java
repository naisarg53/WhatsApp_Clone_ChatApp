package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAwH4Ximg:APA91bF54gJrtIRVycqALCnZn3AR9tNx3t1YFalo9oxgckzHz-phikI5nV9M1SDAaROWUR22apJD-efKvykf8wxy4OqafSWZpXtxaPLhVyzHy-AIpJjlajla5JB9ng-jvDHJ_ffaQz4I"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
