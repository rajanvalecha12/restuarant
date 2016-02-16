package com.training.domains;

import java.util.Scanner;

public class OrderInfo {
	private int orderNo;
	
	private int tableNo;
	private boolean status;
	private boolean paymentStatus;
	private int numberOfDiners;
	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderInfo(int orderNo,int numberOfDiners, int tableNo, boolean status, boolean paymentStatus) {
		super();
		this.orderNo = orderNo;
this.numberOfDiners=numberOfDiners;
		this.tableNo = tableNo;
		this.status = status;
		this.paymentStatus = paymentStatus;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	

	public int getNumberOfDiners() {
		return numberOfDiners;
	}

	public void setNumberOfDiners(int numberOfDiners) {
		this.numberOfDiners = numberOfDiners;
	}

	public String placeOrder() {

		final String cust = orderNo + ":" + ":" + tableNo + ":" + status + ":" + paymentStatus;

		return cust;
	}
	@Override
	public String toString() {
		return "OrderInfo [orderNo=" + orderNo + ", tableNo=" + tableNo + ", status=" + status + ", paymentStatus="
				+ paymentStatus + ", numberOfDiners=" + numberOfDiners + "]";
	}
	
}
