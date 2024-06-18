package com.client.ws.plus.service;

import com.client.ws.plus.dto.UserDto;
import com.client.ws.plus.model.User;

public interface UserService {

    User create(UserDto userDto);
}
