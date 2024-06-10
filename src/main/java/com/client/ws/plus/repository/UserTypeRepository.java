package com.client.ws.plus.repository;

import com.client.ws.plus.model.User;
import com.client.ws.plus.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
