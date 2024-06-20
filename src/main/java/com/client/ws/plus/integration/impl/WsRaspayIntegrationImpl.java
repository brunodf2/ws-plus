package com.client.ws.plus.integration.impl;

import com.client.ws.plus.dto.wsraspay.CustomerDto;
import com.client.ws.plus.dto.wsraspay.OrderDto;
import com.client.ws.plus.dto.wsraspay.PaymentDto;
import com.client.ws.plus.integration.WsRaspayIntegration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@Component
public class WsRaspayIntegrationImpl implements WsRaspayIntegration {

    private RestTemplate restTemplate;

    public WsRaspayIntegrationImpl() {
        restTemplate = new RestTemplate();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        try {
            HttpHeaders headers = getHttpHeaders();
            HttpEntity<CustomerDto> request = new HttpEntity<>(customerDto, headers);
            ResponseEntity<CustomerDto> response = restTemplate.exchange("http://localhost:8081/ws-raspay/v1/customer", HttpMethod.POST, request, CustomerDto.class);
            return response.getBody();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Boolean processPayment(PaymentDto paymentDto) {
        return false;
    }

    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        String credential = "rasmooplus:r@sm00";
        String base64 = Base64.getEncoder().encodeToString(credential.getBytes());
        headers.add("Authorization", "Basic " + base64);
        return headers;
    }
}
