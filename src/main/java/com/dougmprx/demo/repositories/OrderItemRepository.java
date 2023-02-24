package com.dougmprx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougmprx.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
