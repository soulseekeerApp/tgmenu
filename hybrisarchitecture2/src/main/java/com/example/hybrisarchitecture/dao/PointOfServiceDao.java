package com.example.hybrisarchitecture.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface PointOfServiceDao<J> extends  JpaRepository<J, String> {
	/**
	 * Will return a Plant Data by his code
	 * @param code string value unique for each plant
	 * @return	plant model that match the code
	 */
	public J findByCode(String code);
	
	

}
