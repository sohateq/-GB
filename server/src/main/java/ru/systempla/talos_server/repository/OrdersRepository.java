package ru.systempla.talos_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.Order;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
}
