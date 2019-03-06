package com.kwgproperty.server.dataworker.util;

import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by jclang on 2017/9/18.
 */
public class HttpUtil {

    protected final static Logger logger = LoggerFactory.getLogger(HttpUtil.class);
    private static OkHttpClient client = new OkHttpClient();

    public static OkHttpClient getClient() {
        return client;
    }

    public static String get(String url) {
        Request request = new Request.Builder().url(url).get().build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void getAsync(String url, Callback callback) {
        Request request = new Request.Builder().url(url).get().build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public static String post(String url, RequestBody requestBody) {
        Request request = new Request.Builder().url(url).post(requestBody).build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String postHeader(String url, RequestBody requestBody) {
        logger.error("postHeader url:" + url);
        String timestamp = System.currentTimeMillis() / 1000 + "";
        Request request = new Request.Builder().url(url)
                .addHeader("LC-Appkey", "6200a3b9b8bb4fbebd817f0fff2e673b")
                .addHeader("LC-Timestamp", timestamp)
                .addHeader("LC-Sign", StringUtil.MD5("6200a3b9b8bb4fbebd817f0fff2e673b" + timestamp + "bf669def3ba4461aa379be304391793f"))
                .post(requestBody).build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            logger.error("postHeader code:" + response.code());
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void postAsync(String url, RequestBody requestBody, Callback callback) {
        Request request = new Request.Builder().url(url).post(requestBody).build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public static void postAsyncHeader(String url, RequestBody requestBody) {
        Request request = new Request.Builder().url(url).header("APP", "aliyun").post(requestBody).build();
        Call call = client.newCall(request);
        call.enqueue(null);
    }

}
