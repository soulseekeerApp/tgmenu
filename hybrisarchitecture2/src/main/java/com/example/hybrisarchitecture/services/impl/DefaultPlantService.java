package com.example.hybrisarchitecture.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hybrisarchitecture.dao.PlantDao;
import com.example.hybrisarchitecture.model.PlantModel;
import com.example.hybrisarchitecture.services.PlantService;

/**
 * This its a service here its where we add logic to the method we declared in the @PlantService interface
 * @author KC
 *
 */
@Service
public class DefaultPlantService implements PlantService
{
	/**
	 * This its a dependecy for a plantDao object we need it because our service need to interact wiht database
	 * so we add it here and spring will inject it to us
	 */
	private final  PlantDao plantDao;
	
	@Autowired
	public DefaultPlantService(PlantDao plantDao)
	{
		this.plantDao = plantDao;
	}

	@Override
	public List<PlantModel> findAll()
	{
		// asking  the DAO to get all models from the database
		return plantDao.findAll();
	}

	@Override
	public PlantModel findPlantByCode(String code)
	{
		// asking  the DAO to get  all models from the database
		return plantDao.findPlantByCode(code);

	}

}
