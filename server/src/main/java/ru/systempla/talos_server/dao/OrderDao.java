package ru.systempla.talos_server.dao;

import ru.systempla.talos_server.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderDao {

    int insertProduct(Order order);

    List<Order> selectAllProducts();

    Optional<Order> selectProductById(Integer id);

    int deleteProductById(Integer id);

    int updateProductById(Integer id, Order update);
}
