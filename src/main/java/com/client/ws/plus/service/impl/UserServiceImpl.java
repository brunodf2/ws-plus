package com.client.ws.plus.service.impl;

import com.client.ws.plus.dto.UserDto;
import com.client.ws.plus.exception.BadRequestException;
import com.client.ws.plus.exception.NotFoundException;
import com.client.ws.plus.mapper.UserMapper;
import com.client.ws.plus.model.User;
import com.client.ws.plus.model.UserType;
import com.client.ws.plus.repository.UserRepository;
import com.client.ws.plus.repository.UserTypeRepository;
import com.client.ws.plus.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private UserTypeRepository userTypeRepository;

    @Override
    public User create(UserDto userDto) {

        if (Objects.nonNull(userDto.getId())) {
            throw new BadRequestException("id deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(userDto.getUserTypeId());

        if (userTypeOpt.isEmpty()) {
            throw new NotFoundException("userTypeId não encontrado");
        }

        UserType userType = userTypeOpt.get();
        User user = UserMapper.fromDtoToEntity(userDto, userType, null);
        return userRepository.save(user);
    }
}

