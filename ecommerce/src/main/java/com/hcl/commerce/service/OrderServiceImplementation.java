package com.hcl.commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.OrderDTO;
import com.hcl.commerce.entity.Order;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.repository.OrderRepository;

@Service
public class OrderServiceImplementation implements OrderService {

	@Autowired
	OrderRepository repo;
	
	@Autowired
	UserService serv;

	@Override
	public Order addOrder(OrderDTO dto) {
		Order order = new Order();
		BeanUtils.copyProperties(dto, order);
		return repo.save(order);
	}

	@Override
	public Order getOrder(Long id) {
		Optional<Order> order = repo.findById(id);
		if (order.isPresent()) {
			return order.get();
		}
		return null;
	}

	@Override
	public Order updateOrder(OrderDTO dto) {
		Order order = getOrder(dto.getOrderId());
		BeanUtils.copyProperties(dto, order);
		return repo.save(order);
	}

	@Override
	public Order deleteOrder(Long id) {
		Order order = getOrder(id);
		repo.delete(order);
		return order;
	}

	@Override
	public List<Order> getAllOrder() {
		return repo.findAll();
	}

	@Override
	public User getCustomer(Long id) {
		User user = serv.getUser(getOrder(id).getUserId());
		return user;
	}

}
