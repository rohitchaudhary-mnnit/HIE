package com.javaproject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serviceproviders")
public class ServiceProvider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "servicetype")
	private String servicetype;
	
	private String email;
	private String contactNo;
	
	public ServiceProvider() {
		
	}
	public ServiceProvider(String address, String servicetype, String contactNo) {
		super();
		this.address = address;
		this.servicetype = servicetype;
		this.contactNo = contactNo;
	}
	public ServiceProvider(String address, String servicetype, String email, String contactNo) {
		super();
		this.address = address;
		this.servicetype = servicetype;
		this.email = email;
		this.contactNo = contactNo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getServicetype() {
		return servicetype;
	}
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
