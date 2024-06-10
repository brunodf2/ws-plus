package com.client.ws.plus.repository;

import com.client.ws.plus.model.SubscriptionType;
import com.client.ws.plus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType, Long> {
}
