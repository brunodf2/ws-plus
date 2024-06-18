package com.client.ws.plus.controller;

import com.client.ws.plus.dto.SubscriptionTypeDto;
import com.client.ws.plus.model.SubscriptionType;
import com.client.ws.plus.service.SubscriptionTypeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    private SubscriptionTypeService subscriptionTypeService;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionType> create(@Valid @RequestBody SubscriptionTypeDto subscriptionTypeDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionTypeService.create(subscriptionTypeDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionType> update(@PathVariable Long id, @Valid @RequestBody SubscriptionTypeDto subscriptionTypeDto) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.update(id, subscriptionTypeDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        subscriptionTypeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
