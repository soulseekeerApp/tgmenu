package com.example.hybrisarchitecture.facade.populator.impl;

import org.springframework.stereotype.Component;

import com.example.hybrisarchitecture.dto.PlantData;
import com.example.hybrisarchitecture.facade.populator.GenericPopulator;
import com.example.hybrisarchitecture.model.PlantModel;
@Component
public class DefaultPlantPopulator implements GenericPopulator<PlantModel, PlantData>
{

	@Override
	public void populate(PlantModel source, PlantData target)
	{
		target.setPk(source.getPk());
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setDescription(source.getDescription());
		target.setAddress(source.getAddress());
	}

}
