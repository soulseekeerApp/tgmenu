package com.example.hybrisarchitecture.model;

import javax.persistence.Entity;

@Entity
public class RestaurantModel extends PointOfServiceModel {
	private boolean serviceGuest;

	public RestaurantModel() {
	}

	public RestaurantModel(String pk, String name, String description, String code, String address,
			boolean serviceGuest) {
		super(pk, name, description, code, address);
		this.serviceGuest = serviceGuest;
	}

	public boolean isServiceGuest() {
		return serviceGuest;
	}

	public void setServiceGuest(boolean serviceGuest) {
		this.serviceGuest = serviceGuest;
	}

}
