package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "Todo")

public class Todo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 Long id;
	 
	 @Column
	 String statisticsDate;	 
	 @Column
	 String address;	 
	 @Column
	 String borrowPeople;
	 @Column
	 String borrowBook;
	 @Column
	 String renewPeople;
	 @Column
	 String renewBook;
	 @Column
	 String returnPeople;
	 @Column
	 String returnBook;
	 @Column
	 String reservePeople;
	 @Column
	 String reserveBook;
	 @Column
	 String cancelReservePeople;
	 @Column
	 String cancelReserveBook;
	 @Column
	 String borrowAndRenewPeople;
	 @Column
	 String borrowAndRenewBook;
	 
	 
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
	public String getRenewPeople() {
		return renewPeople;
	}
	public void setRenewPeople(String renewPeople) {
		this.renewPeople = renewPeople;
	}
	public String getRenewBook() {
		return renewBook;
	}
	public void setRenewBook(String renewBook) {
		this.renewBook = renewBook;
	}
	public String getReturnPeople() {
		return returnPeople;
	}
	public void setReturnPeople(String returnPeople) {
		this.returnPeople = returnPeople;
	}
	public String getReturnBook() {
		return returnBook;
	}
	public void setReturnBook(String returnBook) {
		this.returnBook = returnBook;
	}
	public String getReservePeople() {
		return reservePeople;
	}
	public void setReservePeople(String reservePeople) {
		this.reservePeople = reservePeople;
	}
	public String getReserveBook() {
		return reserveBook;
	}
	public void setReserveBook(String reserveBook) {
		this.reserveBook = reserveBook;
	}
	public String getCancelReservePeople() {
		return cancelReservePeople;
	}
	public void setCancelReservePeople(String cancelReservePeople) {
		this.cancelReservePeople = cancelReservePeople;
	}
	public String getCancelReserveBook() {
		return cancelReserveBook;
	}
	public void setCancelReserveBook(String cancelReserveBook) {
		this.cancelReserveBook = cancelReserveBook;
	}
	public String getBorrowAndRenewPeople() {
		return borrowAndRenewPeople;
	}
	public void setBorrowAndRenewPeople(String borrowAndRenewPeople) {
		this.borrowAndRenewPeople = borrowAndRenewPeople;
	}
	public String getBorrowAndRenewBook() {
		return borrowAndRenewBook;
	}
	public void setBorrowAndRenewBook(String borrowAndRenewBook) {
		this.borrowAndRenewBook = borrowAndRenewBook;
	}
	 
}
