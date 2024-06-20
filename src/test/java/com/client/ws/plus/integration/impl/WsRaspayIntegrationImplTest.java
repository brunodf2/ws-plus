package com.client.ws.plus.integration.impl;

import com.client.ws.plus.dto.wsraspay.CustomerDto;
import com.client.ws.plus.integration.WsRaspayIntegration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class WsRaspayIntegrationImplTest {

    @Autowired
    private WsRaspayIntegration wsRaspayIntegration;
    @Test
    void createCustomerWhenDtoOK() {
        CustomerDto dto = new CustomerDto(null, "45951399009", "teste@teste.com", "Bruno", "Araujo");
        wsRaspayIntegration.createCustomer(dto);
    }
}