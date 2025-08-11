package com.wipro.orderms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.orderms.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
