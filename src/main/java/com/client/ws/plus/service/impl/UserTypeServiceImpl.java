package com.client.ws.plus.service.impl;

import com.client.ws.plus.model.UserType;
import com.client.ws.plus.repository.UserTypeRepository;
import com.client.ws.plus.service.UserTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserTypeServiceImpl implements UserTypeService {

    UserTypeRepository userTypeRepository;


    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }
}
