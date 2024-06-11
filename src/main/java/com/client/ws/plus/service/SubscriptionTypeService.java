package com.client.ws.plus.service;

import com.client.ws.plus.dto.SubscriptionTypeDto;
import com.client.ws.plus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto);

    SubscriptionType update(Long id, SubscriptionType subscriptionType);

    void delete(Long id);


}
