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
public class PlantModel extends PointOfServiceModel {

	public PlantModel() {
		super();
	}

	public PlantModel(String pk, String name, String description, String code, String address) {
		super(pk, name, description, code, address);
	}
	
	

}
