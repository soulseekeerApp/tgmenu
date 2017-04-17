package com.example.hybrisarchitecture.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RestaurantModel extends PointOfServiceModel
{
	private boolean serviceGuest;

	@ManyToOne
	private PlantModel plant;

	@OneToMany(mappedBy = "restaurant")
	private List<MenuModel> menus;

	public List<MenuModel> getMenus()
	{
		return menus;
	}

	public void setMenus(List<MenuModel> menus)
	{
		this.menus = menus;
	}

	public PlantModel getPlant()
	{
		return plant;
	}

	public void setPlant(PlantModel plant)
	{
		this.plant = plant;
	}

	public RestaurantModel()
	{
	}

	public RestaurantModel(String pk, String name, String description, String code, String address, boolean serviceGuest)
	{
		super(pk, name, description, code, address);
		this.serviceGuest = serviceGuest;
	}

	public boolean isServiceGuest()
	{
		return serviceGuest;
	}

	public void setServiceGuest(boolean serviceGuest)
	{
		this.serviceGuest = serviceGuest;
	}

}
