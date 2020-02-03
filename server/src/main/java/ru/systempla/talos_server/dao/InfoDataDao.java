package ru.systempla.talos_server.dao;

import ru.systempla.talos_server.model.InfoData;
import ru.systempla.talos_server.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface InfoDataDao {

    int insertProduct(InfoData infoData);

    List<InfoData> selectAllProducts();

    Optional<InfoData> selectProductById(Integer id);

    int deleteProductById(Integer id);

    int updateProductById(Integer id, InfoData update);
}
