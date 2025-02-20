package com.techie.microservice.inventory.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.techie.microservice.inventory.repository.*;

@Service
@RequiredArgsConstructor

public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public boolean isInStock (String skuCode, Integer quantity){
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
