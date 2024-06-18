package com.client.ws.plus.controller;

import com.client.ws.plus.model.UserType;
import com.client.ws.plus.service.UserTypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user-type")
public class UserTypeController {

    private UserTypeService userTypeService;

    @GetMapping
    public ResponseEntity<List<UserType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(userTypeService.findAll());
    }
}
