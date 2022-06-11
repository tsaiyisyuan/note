package com.example.dto;

import javax.persistence.Column;

import com.example.entity.Todo;


public class TodoDto {
	
	 Long id;
	 
	 String statisticsDate;	 
	 
	 String address;	 
	 
	 String borrowPeople;
	 
	 String borrowBook;
	 
	 public TodoDto(Todo todo){
		 this.id = todo.getId();
		 this.statisticsDate = todo.getStatisticsDate();
		 this.address = todo.getAddress();
		 this.borrowPeople = todo.getBorrowPeople();
		 this.borrowBook = todo.getBorrowBook();
		 
	 }

	 
	 public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getStatisticsDate() {
		return statisticsDate;
	}



	public void setStatisticsDate(String statisticsDate) {
		this.statisticsDate = statisticsDate;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getBorrowPeople() {
		return borrowPeople;
	}



	public void setBorrowPeople(String borrowPeople) {
		this.borrowPeople = borrowPeople;
	}



	public String getBorrowBook() {
		return borrowBook;
	}



	public void setBorrowBook(String borrowBook) {
		this.borrowBook = borrowBook;
	}

}
