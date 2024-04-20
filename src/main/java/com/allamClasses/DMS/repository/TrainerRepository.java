package com.allamClasses.DMS.repository;
/*
 * @author vikas allam
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allamClasses.DMS.Models.Trainer;
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}