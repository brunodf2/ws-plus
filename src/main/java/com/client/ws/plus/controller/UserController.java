package com.client.ws.plus.controller;

import com.client.ws.plus.dto.UserDto;
import com.client.ws.plus.model.User;
import com.client.ws.plus.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user/")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@Valid @RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(userDto));
    }
}
