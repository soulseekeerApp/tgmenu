package com.example.hybrisarchitecture;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.hybrisarchitecture.dao.PlantDao;
import com.example.hybrisarchitecture.model.PlantModel;
// are remplacing all the xml files so we dont have to manage basic configurations
//....example: persistence.xml,springmvc.xml,web.xml
@SpringBootApplication
public class Hybrisarchitecture2Application {

	public static void main(String[] args) {
		//this its running the Spring Boot Application
		SpringApplication.run(Hybrisarchitecture2Application.class, args);
	}
	
	// a method that its called before the spring initialize
	@Bean
	CommandLineRunner init(final PlantDao plantDao) {

		return new CommandLineRunner() {

			@Override
			public void run(String... arg0) throws Exception {
				PlantModel model = new PlantModel( "ss","code01","address of the plant","name of the plant", "one of the best description for the plant");
				PlantModel model2 = new PlantModel( "ss","code02","address of the plant2","name of the plan2t", "one of the best descriptio22n for the plant");
				plantDao.save(model);
				plantDao.save(model2);

			}

		};

	}
}
