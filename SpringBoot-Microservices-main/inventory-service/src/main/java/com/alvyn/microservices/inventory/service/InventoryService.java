package com.firman.microservices.inventory.service;

import org.springframework.stereotype.Service;

import com.firman.microservices.inventory.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStack(String skuCode, Integer quantity){
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
    }
}
