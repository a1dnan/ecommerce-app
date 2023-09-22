package com.a1dnan.inventoryservice.repository;

import com.a1dnan.inventoryservice.dto.InventoryResponse;
import com.a1dnan.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findBySkuCodeIn(List<String> skuCodes);
}
