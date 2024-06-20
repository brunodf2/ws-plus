package com.client.ws.plus.dto.wsraspay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CredicardDto {

    private String cvv;

    private String documentNumber;

    private Long installments;

    private Long month;

    private String number;

    private Long year;
}
