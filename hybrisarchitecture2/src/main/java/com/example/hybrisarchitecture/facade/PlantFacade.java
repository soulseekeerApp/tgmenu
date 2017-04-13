package com.example.hybrisarchitecture.facade;

import java.util.List;

import com.example.hybrisarchitecture.dto.PlantData;

public interface PlantFacade
{
	public PlantData findPlantByCode(final String code);
	
	public List<PlantData> findAll();
}
