package com.example.hybrisarchitecture.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.hybrisarchitecture.model.ItemModel;
@NoRepositoryBean
public interface ItemDao<T extends ItemModel>  extends JpaRepository<T , String> {
	
	public T findByPk(String pk);
}
