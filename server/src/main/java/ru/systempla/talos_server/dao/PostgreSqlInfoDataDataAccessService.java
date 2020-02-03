package ru.systempla.talos_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.InfoData;
import ru.systempla.talos_server.model.Product;
import ru.systempla.talos_server.repository.InfoDatasRepository;
import ru.systempla.talos_server.repository.ProductsRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("PostgresInfoDataDao")
public class PostgreSqlInfoDataDataAccessService implements InfoDataDao {

    @Autowired
    private InfoDatasRepository infoDatasRepository;

    @Override
    public int insertProduct(InfoData infoData) {
        infoDatasRepository.save(infoData);
        return 1;
    }

    @Override
    public List<InfoData> selectAllProducts() {
        return infoDatasRepository.findAll();
    }

    @Override
    public Optional<InfoData> selectProductById(Integer id) {
       return infoDatasRepository.findById(id);
    }

    @Override
    public int deleteProductById(Integer id) {
        Optional<InfoData> result = infoDatasRepository.findById(id);
        if (result.isEmpty()) {
            return 0;
        } else {
            infoDatasRepository.delete(result.get());
            return 1;
        }
    }

    @Override
    public int updateProductById(Integer id, InfoData update) {
        Optional<InfoData> result = selectProductById(id);
        if (result.isEmpty()) return 0;
        infoDatasRepository.save(new InfoData(id, update.getName(), update.getWeight(),
                update.getPriceSv(), update.getPriceRin(), update.getPriceDzsl()));
        return 1;
    }
}
