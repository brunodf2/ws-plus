package com.client.ws.plus.service.impl;

import com.client.ws.plus.controller.SubscriptionTypeController;
import com.client.ws.plus.dto.SubscriptionTypeDto;
import com.client.ws.plus.exception.BadRequestException;
import com.client.ws.plus.exception.NotFoundException;
import com.client.ws.plus.mapper.SubscriptionTypeMapper;
import com.client.ws.plus.model.SubscriptionType;
import com.client.ws.plus.repository.SubscriptionTypeRepository;
import com.client.ws.plus.service.SubscriptionTypeService;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SubscriptionTypeServicerImpl implements SubscriptionTypeService {


    private static final String DELETE = "delete";
    private static final String UPDATE = "update";
    private SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {

        return getSubscriptionType(id).add(WebMvcLinkBuilder.linkTo(
                        WebMvcLinkBuilder.methodOn(SubscriptionTypeController.class).findById(id)).withSelfRel())
                .add(WebMvcLinkBuilder.linkTo(
                        WebMvcLinkBuilder.methodOn(SubscriptionTypeController.class).update(id, new SubscriptionTypeDto())).withRel(UPDATE))
                .add(WebMvcLinkBuilder.linkTo(
                        WebMvcLinkBuilder.methodOn(SubscriptionTypeController.class).delete(id)).withRel(DELETE));

    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto) {
        if (Objects.nonNull(subscriptionTypeDto.getId())) {
            throw new BadRequestException("Id deve ser nulo.");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(subscriptionTypeDto));
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDto subscriptionTypeDto) {
        getSubscriptionType(id);
        subscriptionTypeDto.setId(id);
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(subscriptionTypeDto));
    }

    @Override
    public void delete(Long id) {
        getSubscriptionType(id);
        subscriptionTypeRepository.deleteById(id);
    }

    private SubscriptionType getSubscriptionType(Long id) {
        Optional<SubscriptionType> result = subscriptionTypeRepository.findById(id);
        return result.orElseThrow(() -> new NotFoundException("SubscriptionType não encontrado."));
    }
}
