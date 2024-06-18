package com.client.ws.plus.mapper;

import com.client.ws.plus.dto.SubscriptionTypeDto;
import com.client.ws.plus.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto subscriptionTypeDto) {
        return SubscriptionType.builder()
                .id(subscriptionTypeDto.getId())
                .name(subscriptionTypeDto.getName())
                .accessMonth(subscriptionTypeDto.getAccessMonth())
                .price(subscriptionTypeDto.getPrice())
                .productKey(subscriptionTypeDto.getProductKey())
                .build();
    }
}
