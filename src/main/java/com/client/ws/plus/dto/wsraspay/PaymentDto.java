package com.client.ws.plus.dto.wsraspay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private CredicardDto credicard;

    private String customerId;

    private String orderId;

}
