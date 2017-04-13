package com.example.hybrisarchitecture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class ItemModel {

	@Id
	@GeneratedValue
	private String pk;

	private String name;

	private String description;

	
	public ItemModel() {
	}
	public ItemModel(String pk, String name, String description) {
		super();
		this.pk = pk;
		this.name = name;
		this.description = description;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
