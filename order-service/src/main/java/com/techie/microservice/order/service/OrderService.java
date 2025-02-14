package com.techie.microservice.order.service;

import org.springframework.stereotype.Service;
import com.techie.microservice.order.dto.OrderRequest;
import com.techie.microservice.order.model.Order;
import com.techie.microservice.order.reposiory.OrderRepository;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode((orderRequest.skuCode()));
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
    }
}
