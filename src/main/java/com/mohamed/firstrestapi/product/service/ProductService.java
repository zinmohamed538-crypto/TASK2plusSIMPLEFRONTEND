package com.mohamed.firstrestapi.product.service;

import com.mohamed.firstrestapi.product.api.request.ProductRequest;
import com.mohamed.firstrestapi.product.api.request.UpdateProductRequest;
import com.mohamed.firstrestapi.product.api.response.ProductResponse;
import com.mohamed.firstrestapi.product.domain.Product;
import com.mohamed.firstrestapi.product.exception.ProductNotFoundException;
import com.mohamed.firstrestapi.product.repository.ProductRepository;
import com.mohamed.firstrestapi.product.support.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest request) {

        Product product = productMapper.toEntity(request);

        Product savedProduct = productRepository.save(product);

        return productMapper.toResponse(savedProduct);
    }

    public ProductResponse findById(Long id) {

        Product product = productRepository
                .findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException(id)
                );

        return productMapper.toResponse(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {

        Product product = productRepository
                .findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException(id)
                );

        product.setName(request.getName());

        Product savedProduct = productRepository.save(product);

        return productMapper.toResponse(savedProduct);
    }

    public void delete(Long id) {

        Product product = productRepository
                .findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException(id)
                );

        productRepository.deleteById(id);
    }

    public List<ProductResponse> findAll() {

        return productRepository
                .findAll()
                .stream()
                .map(productMapper::toResponse)
                .toList();
    }
}