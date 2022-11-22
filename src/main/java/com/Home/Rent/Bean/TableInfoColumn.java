package com.Home.Rent.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TableInfoColumn {
	
	@Id
	private int customerId ;
	@Column
	private int room_No;
	@Column
	private String nameOfStudent;
	@Column
	private String Address;
	@Column
	private String contactNo;
	@Column
	private String emailId;
	@Column
	private String rentPayDate;
	
	
	@Override
	public String toString() {
		return "TableInfoColumn [room_No=" + room_No + ", nameOfStudent=" + nameOfStudent + ", Address=" + Address
				+ ", contactNo=" + contactNo + ", emailId=" + emailId + ", rentPayDate=" + rentPayDate + ", customerId="
				+ customerId + "]";
	}
	
	
	
	
	
	
	public TableInfoColumn(int customerId, int room_No, String nameOfStudent, String address, String contactNo,
			String emailId, String rentPayDate) {
		super();
		this.customerId = customerId;
		this.room_No = room_No;
		this.nameOfStudent = nameOfStudent;
		Address = address;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.rentPayDate = rentPayDate;
	}
	
	public TableInfoColumn() {}






	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getRoom_No() {
		return room_No;
	}
	public void setRoom_No(int room_No) {
		this.room_No = room_No;
	}
	public String getNameOfStudent() {
		return nameOfStudent;
	}
	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRentPayDate() {
		return rentPayDate;
	}
	public void setRentPayDate(String rentPayDate) {
		this.rentPayDate = rentPayDate;
	}
	
	
	

}
