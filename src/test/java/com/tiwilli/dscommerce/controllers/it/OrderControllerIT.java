package com.tiwilli.dscommerce.controllers.it;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tiwilli.dscommerce.dto.OrderDTO;
import com.tiwilli.dscommerce.entities.Order;
import com.tiwilli.dscommerce.entities.OrderItem;
import com.tiwilli.dscommerce.entities.User;
import com.tiwilli.dscommerce.factories.OrderFactory;
import com.tiwilli.dscommerce.factories.OrderItemFactory;
import com.tiwilli.dscommerce.factories.UserFactory;
import com.tiwilli.dscommerce.utils.TokenUtil;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class OrderControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private ObjectMapper objectMapper;

    private Long existingOrderId;
    private Long nonExistingOrderId;

    private String clientUsername;
    private String clientPassword;
    private String adminUsername;
    private String adminPassword;
    private String clientToken;
    private String adminToken;
    private String invalidToken;

    private Order order;
    private OrderDTO orderDTO;
    private User user;


    @BeforeEach
    void setUp() throws Exception {

        existingOrderId = 1L;
        nonExistingOrderId = 1000L;

        clientUsername = "maria@gmail.com";
        clientPassword = "123456";
        adminUsername = "alex@gmail.com";
        adminPassword = "123456";

        clientToken = tokenUtil.obtainAccessToken(mockMvc, clientUsername, clientPassword);
        adminToken = tokenUtil.obtainAccessToken(mockMvc, adminUsername, adminPassword);
        invalidToken = adminToken + "xtpo";

        user = UserFactory.createClientUser();
        order = OrderFactory.createOrder(user);
        OrderItem orderItem = OrderItemFactory.createOrderItem(order);
        order.getItems().add(orderItem);

    }
    
}
