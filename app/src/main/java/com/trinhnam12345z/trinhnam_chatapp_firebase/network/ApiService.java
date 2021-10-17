package com.trinhnam12345z.trinhnam_chatapp_firebase.network;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface ApiService {

    @POST
    Call<String> sendMessage(
            @HeaderMap HashMap<String, String> header,
            @Body String messageBody
    );

}
