package com.tiwilli.dscommerce.factories;

import com.tiwilli.dscommerce.entities.Order;
import com.tiwilli.dscommerce.entities.OrderItem;
import com.tiwilli.dscommerce.entities.Product;

public class OrderItemFactory {

    public static OrderItem createOrderItem(Order order) {
        Product product = ProductFactory.createProduct();

        return new OrderItem(order, product, 2, 10.0);
    }
}
