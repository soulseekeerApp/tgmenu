package com.example.hybrisarchitecture.model;

import javax.persistence.Entity;

@Entity
public class ProductModel extends ItemModel {
	private String code;

	public ProductModel() {
	}

	public ProductModel(String pk, String name, String description, String code) {
		super(pk, name, description);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
