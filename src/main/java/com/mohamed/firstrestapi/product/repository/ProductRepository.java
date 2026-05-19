package com.mohamed.firstrestapi.product.repository;

import com.mohamed.firstrestapi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
