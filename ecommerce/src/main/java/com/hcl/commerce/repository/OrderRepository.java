package com.hcl.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.commerce.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
