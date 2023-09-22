package com.a1dnan.inventoryservice.service;

import com.a1dnan.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    List<InventoryResponse> isInStock(List<String> skuCodes);
}
