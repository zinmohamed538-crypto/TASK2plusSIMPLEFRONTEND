package com.mohamed.firstrestapi.product.support;

import com.mohamed.firstrestapi.product.api.request.ProductRequest;
import com.mohamed.firstrestapi.product.api.response.ProductResponse;
import com.mohamed.firstrestapi.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        return new Product(null, request.getName());
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName()
        );
    }
}