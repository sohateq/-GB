package ru.systempla.talos_server.service;

import ru.systempla.talos_server.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    int create(Order order);

    List<Order> readAll();

    Optional<Order> read(Integer id);

    int update(Order order, Integer id);

    int delete(Integer id);
}
