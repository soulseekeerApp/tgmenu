package com.example.hybrisarchitecture.dao;

import com.example.hybrisarchitecture.model.PlantModel;

public interface PlantDao extends ItemDao<PlantModel>
{
	/**
	 * Will return a Plant Data by his code
	 * @param code string value unique for each plant
	 * @return	plant model that match the code
	 */
	public PlantModel findPlantByCode(String code);

}
