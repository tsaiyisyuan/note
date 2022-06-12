package com.example.service;

import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.repository.TodoRepository;
import com.example.entity.Todo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
/**
 * test comment
 * */
public class DataService {
	
	@Autowired
	private TodoRepository todoRepository;

	@PostConstruct
	private void init() {
		log.info("init test");
		String content = null;
		URLConnection connection = null;
		try {
		  connection =  new URL("https://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/514/ee31f74d-c94f-4ecf-bbad-1e05f8147abd.json").openConnection();
		  Scanner scanner = new Scanner(connection.getInputStream());
		  scanner.useDelimiter("\\Z");
		  content = scanner.next();
		  scanner.close();
		}catch ( Exception ex ) {
			log.error("",ex);
		}
		

		
		Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
	    List<Map<String, String>> list = new Gson().fromJson(content, listType);  //list<map> 物件

		List<Todo> todoObjs = new ArrayList<Todo>(); //轉成DB的list物件
		for (Map<String, String> data : list) {
			Todo todoObj = new Todo();
			todoObj.setStatisticsDate(data.get("統計年月"));
			todoObj.setAddress(data.get("館藏地"));
			todoObj.setBorrowPeople(data.get("借閱人次"));
			todoObj.setBorrowBook(data.get("借閱冊數"));
			todoObj.setRenewPeople(data.get("續借人次"));
			todoObj.setRenewBook(data.get("續借冊數"));
			todoObj.setReturnPeople(data.get("還書人次"));
			todoObj.setReturnBook(data.get("還書冊數"));
			todoObj.setReservePeople(data.get("預約人次"));
			todoObj.setReserveBook(data.get("預約冊數"));
			todoObj.setCancelReservePeople(data.get("取消預約人次"));
			todoObj.setCancelReserveBook(data.get("取消預約冊數"));
			todoObj.setBorrowAndRenewPeople(data.get("借閱+續借人次"));
			todoObj.setBorrowAndRenewBook(data.get("借閱+續借冊數"));
			todoObjs.add(todoObj);
		}
	    		
		todoRepository.saveAll(todoObjs);
	}
	
	/**
	 * 
	 * @return 尋找全部資料
	 * */	
	public List<Todo> findAll() {
		return todoRepository.findAll();
	}
	
	/**
	 * 
	 * 刪除資料
	 * */	
	public void deleteResult(String id) {
		todoRepository.deleteById(Long.valueOf(id));
	}

}
