package com.client.ws.plus.service.impl;

import com.client.ws.plus.dto.SubscriptionTypeDto;
import com.client.ws.plus.exception.NotFoundException;
import com.client.ws.plus.model.SubscriptionType;
import com.client.ws.plus.repository.SubscriptionTypeRepository;
import com.client.ws.plus.service.SubscriptionTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SubscriptionTypeServicerImpl implements SubscriptionTypeService {

    private SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        Optional<SubscriptionType> result = subscriptionTypeRepository.findById(id);
        return result.orElseThrow(() -> new NotFoundException("SubscriptionType not found"));
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto) {
        return subscriptionTypeRepository.save(SubscriptionType.builder()
                .id(subscriptionTypeDto.getId())
                .name(subscriptionTypeDto.getName())
                .accessMonth(subscriptionTypeDto.getAccessMonth())
                .price(subscriptionTypeDto.getPrice())
                .productKey(subscriptionTypeDto.getProductKey())
                .build()
        );
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
