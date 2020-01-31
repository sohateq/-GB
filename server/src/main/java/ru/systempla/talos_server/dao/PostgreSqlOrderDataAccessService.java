package ru.systempla.talos_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.InfoData;
import ru.systempla.talos_server.model.Order;
import ru.systempla.talos_server.repository.InfoDatasRepository;
import ru.systempla.talos_server.repository.OrdersRepository;

import java.util.List;
import java.util.Optional;

@Repository("PostgresOrderDao")
public class PostgreSqlOrderDataAccessService implements OrderDao {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public int insertProduct(Order order) {
        ordersRepository.save(order);
        return 1;
    }

    @Override
    public List<Order> selectAllProducts() {
        return ordersRepository.findAll();
    }

    @Override
    public Optional<Order> selectProductById(Integer id) {
       return ordersRepository.findById(id);
    }

    @Override
    public int deleteProductById(Integer id) {
        Optional<Order> result = ordersRepository.findById(id);
        if (result.isEmpty()) {
            return 0;
        } else {
            ordersRepository.delete(result.get());
            return 1;
        }
    }

    @Override
    public int updateProductById(Integer id, Order update) {
        Optional<Order> result = selectProductById(id);
        if (result.isEmpty()) return 0;
        ordersRepository.save(new Order(id, update.getClientName(), update.getCreationDate(), update.getAcceptionDate(),
                update.getReturnDate(), update.getTypeOneCount(), update.getTypeTwoCount(), update.getTypeThreeCount(),
                update.getTypeFourCount(), update.getTypeFiveCount(), update.getTypeSixCount(), update.getTypeSevenCount(),
                update.getOrderStatus()));
        return 1;
    }
}
