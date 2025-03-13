package com.firman.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firman.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
