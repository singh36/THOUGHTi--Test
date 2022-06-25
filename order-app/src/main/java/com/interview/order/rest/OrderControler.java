package com.interview.order.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.order.modalDao.Order;


@RestController
public class OrderControler {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/test")
	 public String test(){
		return "Hello world";
	}
	
	@GetMapping("/order/")
	 public Order getSpecficOrder(@RequestParam(value = "order_id") int orderId){
		return orderService.getOderById(orderId);
	}
	
	@PostMapping("/order/create")
	public String createNewOder(@RequestBody List<Order> orders){
		orderService.saveOders(orders);
		return "Saved data";
	}
	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		return (List<Order>) orderService.getAllOders();
	}
}
