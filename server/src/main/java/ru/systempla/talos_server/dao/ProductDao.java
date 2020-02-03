package ru.systempla.talos_server.dao;

import ru.systempla.talos_server.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDao {

    int insertProduct(Product product);

    List<Product> selectAllProducts();

    Optional<Product> selectProductById(Integer id);

    int deleteProductById(Integer id);

    int updateProductById(Integer id, Product update);
}
