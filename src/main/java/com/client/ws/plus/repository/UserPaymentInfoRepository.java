package com.client.ws.plus.repository;

import com.client.ws.plus.model.User;
import com.client.ws.plus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
