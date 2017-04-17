package com.example.hybrisarchitecture.facade.converter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.hybrisarchitecture.dto.PlantData;
import com.example.hybrisarchitecture.facade.converter.GenericConverter;
import com.example.hybrisarchitecture.facade.populator.GenericPopulator;
import com.example.hybrisarchitecture.model.PlantModel;
@Component
public class DefaultPlantConverter implements GenericConverter<PlantModel, PlantData>
{
	private final GenericPopulator<PlantModel, PlantData> plantPopulator;

	@Autowired
	public DefaultPlantConverter(GenericPopulator<PlantModel, PlantData> plantPopulator)
	{
		this.plantPopulator = plantPopulator;
	}

	@Override
	public PlantData convert(PlantModel source, PlantData target)
	{
		plantPopulator.populate(source, target);
		
		return target;
	}

	@Override
	public PlantData convert(PlantModel source)
	{
		PlantData target = new PlantData();
		
		return convert(source, target);
	}

}
