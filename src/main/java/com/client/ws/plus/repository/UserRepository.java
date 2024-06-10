package com.client.ws.plus.repository;

import com.client.ws.plus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
