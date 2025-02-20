package com.techie.microservice.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techie.microservice.inventory.model.*;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);

}
