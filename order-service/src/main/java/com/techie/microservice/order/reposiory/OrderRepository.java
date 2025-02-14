package com.techie.microservice.order.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techie.microservice.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
