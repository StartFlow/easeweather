package com.example.easeweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ZS_PC on 2017/10/10.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
