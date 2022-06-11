package com.example.demo;

import java.io.IOException;

import org.json.JSONArray;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class CallApi {
	

	public static void main(String[] args) throws IOException {
		OkHttpClient okHttpClient = new OkHttpClient();

		Request request = new Request.Builder()
		        .url("https://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/514/ee31f74d-c94f-4ecf-bbad-1e05f8147abd.json")
		        .build();
		
		Response response = okHttpClient.newCall(request).execute();
		JSONArray jsonArr = new JSONArray(response.body().string());
		System.out.println("call json:"+jsonArr);
	}

}
