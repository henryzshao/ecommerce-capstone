package com.hcl.commerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.OrderDTO;
import com.hcl.commerce.entity.Order;
import com.hcl.commerce.entity.User;

@Service
public interface OrderService {

	Order addOrder(OrderDTO dto);

	Order getOrder(Long id);

	Order updateOrder(OrderDTO dto);

	Order deleteOrder(Long id);

	List<Order> getAllOrder();

	User getCustomer(Long id);

}
