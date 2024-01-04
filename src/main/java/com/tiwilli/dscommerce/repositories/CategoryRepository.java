package com.tiwilli.dscommerce.repositories;

import com.tiwilli.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
