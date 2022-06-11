package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Slf4j
@SpringBootTest
class Demo1ApplicationTests {

	@Test
	void contextLoads() throws Exception {
		
		OkHttpClient okHttpClient = new OkHttpClient();

		Request request = new Request.Builder()
		        .url("https://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/514/ee31f74d-c94f-4ecf-bbad-1e05f8147abd.json")
		        .build();
		
		Response response = okHttpClient.newCall(request).execute();
		JSONArray jsonArr = new JSONArray(response.body().string());
		log.info("jsonArr{}",jsonArr);
	}

}
