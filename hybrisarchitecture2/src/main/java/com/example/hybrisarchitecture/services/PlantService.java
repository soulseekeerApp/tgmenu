package com.example.hybrisarchitecture.services;

import java.util.List;

import com.example.hybrisarchitecture.model.PlantModel;

/**
 * This represent the interface of a  service that we must implement
 * @author KC
 *
 */
public interface PlantService
{
	public List<PlantModel> findAll();	
	
	public PlantModel findPlantByCode(String code);
}
