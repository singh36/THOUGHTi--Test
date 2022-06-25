package com.interview.order.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.order.modalDao.Order;
import com.interview.order.repository.OrderReposotory;


@Service
public class OrderService {
	@Autowired
	OrderReposotory orderReposotory;
	
	public Order getAllOders(){
		return (Order) orderReposotory.findAll();
	}
	
	public Order getOderById(int Id) {
		return  orderReposotory.findById(Id).get();
	}
	
	public void saveOders(List<Order> orders) {
		orderReposotory.saveAll(orders);
	}
}

