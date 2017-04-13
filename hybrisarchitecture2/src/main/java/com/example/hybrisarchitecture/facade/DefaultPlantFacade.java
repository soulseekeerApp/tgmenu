package com.example.hybrisarchitecture.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.hybrisarchitecture.dto.PlantData;
import com.example.hybrisarchitecture.facade.converter.GenericConverter;
import com.example.hybrisarchitecture.model.PlantModel;
import com.example.hybrisarchitecture.services.PlantService;

/**
 * This its the Facade for Plant here we will need to use PlantService PlantConverter
 * 
 * @author KC
 *
 */
@Component // this compoenent annotation its telling spring to generate a bean for this calss
public class DefaultPlantFacade implements PlantFacade
{

	private final PlantService plantService;
	private final GenericConverter<PlantModel, PlantData> plantConverter;

	@Autowired
	public DefaultPlantFacade(PlantService plantService, GenericConverter<PlantModel, PlantData> plantConverter)
	{
		this.plantService = plantService;
		this.plantConverter = plantConverter;
	}

	@Override
	public PlantData findPlantByCode(String code)
	{
		PlantModel model = plantService.findPlantByCode(code);
		
		if (model != null)
		{
			return plantConverter.convert(model);
		}
		
		// return null if it is emptywe didnt used it
		return null;
	}

	@Override
	public List<PlantData> findAll()
	{
		List<PlantModel> models = plantService.findAll();

		if (!models.isEmpty())
		{
			// creating the list that we are suposed to return
			List<PlantData> dtos = new ArrayList<>();

			// java 8 feature but the same as below
			// we use the converter to convert a model to a dto
			models.forEach(model -> dtos.add(plantConverter.convert(model)));
			// for(PlantModel model : models){ dtos.add(plantConverter.convert(model)); }

			return dtos;
		}

		// return null if it is empty
		return null;
	}

}
