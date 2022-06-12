package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.TodoDto;
import com.example.entity.Todo;
import com.example.service.DataService;

import lombok.extern.slf4j.Slf4j;

/**
 * DataController
 * */
@Slf4j
@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class DataController {

	@Autowired
	private DataService dataService;
	
	/**
	 * @return 回傳"新竹市公共圖書館"JAVA物件
	 * */
	@RequestMapping(path = "/getResult", method = RequestMethod.POST)
	public List<Todo> getResult() {
		
		/*List<Todo> todos =  dataService.findAll(); //資料庫拿到的所有資料
		List<TodoDto> todoDtos = new ArrayList<TodoDto>();//要丟回前端的
		for(Todo todo:todos) { //整理資料庫的資料只取需要的欄位
			TodoDto todoDto = new TodoDto(todo); //透過todoDto的建構子進行get,set的動作
			todoDtos.add(todoDto);  //在塞到todoDtos以利傳回前端，設置DTO用意是解耦合
		}*/
		return dataService.findAll(); 		
	}
	
	/**
	 * @param id 要刪除的ID
	 * */
	@RequestMapping(path = "/deleteResult", method = RequestMethod.POST)
	public void deleteResult(@RequestBody String id) {
		log.info("deleteResult id:{}",id);
		dataService.deleteResult(id);
	}
	

}
