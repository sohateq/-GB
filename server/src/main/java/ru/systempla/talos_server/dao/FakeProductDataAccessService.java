package ru.systempla.talos_server.dao;

import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.Product;

import java.util.*;

@Repository("fakeDao")
public class FakeProductDataAccessService implements ProductDao {

    // Хранилище
    private static List<Product> DB = new ArrayList<>();

    @Override
    public int insertProduct(UUID id, Product product) {
        DB.add(new Product(id, product.getName(), product.getSource(), product.getStatus(), product.getCount()));
        return 1;
    }

    @Override
    public List<Product> selectAllProducts() {
        return DB;
    }

    @Override
    public Optional<Product> selectProductById(UUID id) {
        return DB.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteProductById(UUID id) {
        Optional<Product> productMaybe = selectProductById(id);
        if (!productMaybe.isPresent()){
            return 0;
        }
        DB.remove((productMaybe.get()));
        return 1;
    }

    @Override
    public int updateProductById(UUID id, Product update) {
        return selectProductById(id)
                .map(product -> {
                    int indexOfProductToUpdate = DB.indexOf(product);
                    if (indexOfProductToUpdate >= 0) {
                        DB.set(indexOfProductToUpdate,
                                new Product(id, update.getName(), update.getSource(), update.getStatus(), update.getCount()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
