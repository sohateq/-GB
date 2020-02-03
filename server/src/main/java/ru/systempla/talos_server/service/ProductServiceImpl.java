package ru.systempla.talos_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.systempla.talos_server.dao.ProductDao;
import ru.systempla.talos_server.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(@Qualifier("PostgresProductDao") ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public int create(Product product) {
        return productDao.insertProduct(product);
    }

    @Override
    public List<Product> readAll() {
        return productDao.selectAllProducts();
    }

    @Override
    public Optional<Product> read(Integer id) {
        return productDao.selectProductById(id) ;
    }

    @Override
    public int update(Product product, Integer id) {
        return productDao.updateProductById(id, product);
    }

    @Override
    public int delete(Integer id) {
        return productDao.deleteProductById(id);
    }
}
