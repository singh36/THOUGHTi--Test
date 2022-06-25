package com.interview.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.interview.order.modalDao.Items;


@Repository
public interface ItemsRepository extends CrudRepository<Items, Integer> {

}
