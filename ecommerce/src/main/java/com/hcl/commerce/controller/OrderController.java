package com.hcl.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.OrderDTO;
import com.hcl.commerce.entity.Order;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("admin/orders/add")
	public Order addOrder(@RequestBody OrderDTO dto) {
		return orderService.addOrder(dto);
	}
	
	@GetMapping("admin/orders/get/{id}")
	public Order getOrder(@PathVariable Long id) {
		return orderService.getOrder(id);
	}
	
	@PostMapping("admin/orders/update")
	public Order updateOrder(@RequestBody OrderDTO dto) {
		return orderService.updateOrder(dto);
	}
	
	@DeleteMapping("admin/orders/delete/{id}")
	public Order deleteOrder(@PathVariable Long id) {
		return orderService.deleteOrder(id);
	}
	
	@GetMapping("admin/orders/all")
	public List<Order> allOrder(){
		return orderService.getAllOrder();
	}
	
	@GetMapping("admin/orders/getCustomer")
	public User getCustomer(@PathVariable Long id) {
		return orderService.getCustomer(id);
	}
	
}
