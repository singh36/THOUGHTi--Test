package com.interview.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.interview.order.modalDao.Order;


@Repository
public interface OrderReposotory extends CrudRepository<Order, Integer> {

}
