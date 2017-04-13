package com.example.hybrisarchitecture.model;

import javax.persistence.Entity;

/**
 * This class will represent the generated class from the
 * {projectname}-items.xml file present in the hybris project each <ItemType> of
 * that file will be mapped to a java class like this
 * 
 * @author KC
 *
 */
@Entity

public class PlantModel extends ItemModel {

	private String code;

	private String address;

	
	

	public PlantModel() {
		// TODO Auto-generated constructor stub
	}
	public PlantModel(String pk, String name, String description, String code, String address) {
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
