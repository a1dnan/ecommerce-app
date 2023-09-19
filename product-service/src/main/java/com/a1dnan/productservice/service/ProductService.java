package com.a1dnan.productservice.service;

import com.a1dnan.productservice.dto.ProductRequest;
import com.a1dnan.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
