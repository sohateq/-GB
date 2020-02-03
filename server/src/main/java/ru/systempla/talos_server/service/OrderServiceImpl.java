package ru.systempla.talos_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.systempla.talos_server.dao.InfoDataDao;
import ru.systempla.talos_server.dao.OrderDao;
import ru.systempla.talos_server.model.InfoData;
import ru.systempla.talos_server.model.Order;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(@Qualifier("PostgresOrderDao") OrderDao orderDao){
        this.orderDao = orderDao;
    }

    @Override
    public int create(Order order) {
        return orderDao.insertProduct(order);
    }

    @Override
    public List<Order> readAll() {
        return orderDao.selectAllProducts();
    }

    @Override
    public Optional<Order> read(Integer id) {
        return orderDao.selectProductById(id) ;
    }

    @Override
    public int update(Order order, Integer id) {
        return orderDao.updateProductById(id, order);
    }

    @Override
    public int delete(Integer id) {
        return orderDao.deleteProductById(id);
    }
}
