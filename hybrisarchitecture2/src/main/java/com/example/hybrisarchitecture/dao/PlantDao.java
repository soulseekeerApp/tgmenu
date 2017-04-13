package com.example.hybrisarchitecture.dao;

import com.example.hybrisarchitecture.model.PlantModel;

/**
 * This class reperesend DAO(Data Access Object) in hybris are the delegate to interact with database
 * 
 * @author KC
 *
 */
public interface PlantDao extends ItemDao<PlantModel> , PointOfServiceDao<PlantModel>
{
	
}
