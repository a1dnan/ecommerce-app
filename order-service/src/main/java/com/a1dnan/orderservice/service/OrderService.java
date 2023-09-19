package com.a1dnan.orderservice.service;

import com.a1dnan.orderservice.dto.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
