package com.interview.food.order;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.interview.order.modalDao.Items;
import com.interview.order.modalDao.Order;
import com.interview.order.repository.OrderReposotory;
import com.interview.order.rest.OrderService;

@Nested
public class OrderControllerTest extends OrderApplicationTests {

	@MockBean
	OrderService orderService;
	
	@MockBean 
	OrderReposotory orderRepo;
	
	@Test
	public void createOrder() {
		Order order = new Order();
		order.setOrderDate("");
		order.setItems(new Items());
		order.setOrderId(1);
		order.setOrderStatus("NEW");
		orderRepo.save(order);
		Order newOrd =orderService.getOderById(order.getOrderId());
		assertThat(order.getOrderId()).isEqualTo(newOrd.getOrderId());
	}
	
	
	@Test
	public void findOrder() {	
		Order order = new Order();
		order.setOrderDate("");
		order.setItems(new Items());
		order.setOrderId(1);
		order.setOrderStatus("NEW");
		Order newOrd =orderService.getOderById(order.getOrderId());
		assertThat(order.getOrderId()).isEqualTo(newOrd.getOrderId());
	}
	
	
	@Test
	public void findAllOrders() {
		Order order = new Order();
		order.setOrderDate("");
		order.setItems(new Items());
		order.setOrderId(1);
		order.setOrderStatus("NEW");
		List<Order> newOrd = (List<Order>) orderService.getAllOders();
		assertThat(order).isEqualTo(newOrd.contains(order));
	}
}
