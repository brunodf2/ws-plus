package com.client.ws.plus.integration;

import com.client.ws.plus.dto.wsraspay.CustomerDto;
import com.client.ws.plus.dto.wsraspay.OrderDto;
import com.client.ws.plus.dto.wsraspay.PaymentDto;

public interface WsRaspayIntegration {

    CustomerDto createCustomer(CustomerDto customerDto);

    OrderDto createOrder(OrderDto orderDto);

    Boolean processPayment(PaymentDto paymentDto);
}
