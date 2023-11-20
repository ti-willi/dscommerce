package com.tiwilli.dscommerce.repositories;

import com.tiwilli.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
