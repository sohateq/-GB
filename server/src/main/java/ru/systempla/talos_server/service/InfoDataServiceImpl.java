package ru.systempla.talos_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.systempla.talos_server.dao.InfoDataDao;
import ru.systempla.talos_server.model.InfoData;

import java.util.List;
import java.util.Optional;

@Service
public class InfoDataServiceImpl implements InfoDataService{

    private final InfoDataDao infoDataDao;

    @Autowired
    public InfoDataServiceImpl(@Qualifier("PostgresInfoDataDao") InfoDataDao infoDataDao){
        this.infoDataDao = infoDataDao;
    }

    @Override
    public int create(InfoData infoData) {
        return infoDataDao.insertProduct(infoData);
    }

    @Override
    public List<InfoData> readAll() {
        return infoDataDao.selectAllProducts();
    }

    @Override
    public Optional<InfoData> read(Integer id) {
        return infoDataDao.selectProductById(id) ;
    }

    @Override
    public int update(InfoData infoData, Integer id) {
        return infoDataDao.updateProductById(id, infoData);
    }

    @Override
    public int delete(Integer id) {
        return infoDataDao.deleteProductById(id);
    }
}
