package com.example.hybrisarchitecture.model;

import javax.persistence.Entity;

@Entity
public abstract class PointOfServiceModel extends ItemModel {
	private String code;
	private String address;

	public PointOfServiceModel() {
	}
	

	public PointOfServiceModel(String pk, String name, String description, String code, String address) {
		super(pk, name, description);
		this.code = code;
		this.address = address;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
