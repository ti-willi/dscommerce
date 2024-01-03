package com.tiwilli.dscommerce.repositories;

import com.tiwilli.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
