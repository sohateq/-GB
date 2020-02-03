package ru.systempla.talos_server.service;

import ru.systempla.talos_server.model.InfoData;

import java.util.List;
import java.util.Optional;

public interface InfoDataService {

    int create(InfoData infoData);

    List<InfoData> readAll();

    Optional<InfoData> read(Integer id);

    int update(InfoData infoData, Integer id);

    int delete(Integer id);
}
