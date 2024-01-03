package com.tiwilli.dscommerce.repositories;

import com.tiwilli.dscommerce.entities.OrderItem;
import com.tiwilli.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
