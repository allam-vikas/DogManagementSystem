package com.allamClasses.DMS.repository;
/*
 * @author vikas allam
 */

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.allamClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog> findByName(String name);
	

}

