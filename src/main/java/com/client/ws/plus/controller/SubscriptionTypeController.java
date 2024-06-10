package com.client.ws.plus.controller;

import com.client.ws.plus.model.SubscriptionType;
import com.client.ws.plus.repository.SubscriptionTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    private SubscriptionTypeRepository subscriptionTypeRepository;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        List<SubscriptionType> response = subscriptionTypeRepository.findAll();
        return ResponseEntity.ok().body(response);
    }
}
