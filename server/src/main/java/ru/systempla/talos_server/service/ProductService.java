package ru.systempla.talos_server.service;

import ru.systempla.talos_server.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    /**
     * Создает новый продукт
     * @param product - продукт для создания
     * @return - 1 если продукт был добавлен
     */
    int create(Product product);

    /**
     * Возвращает список всех имеющихся продуктов
     * @return список продуктов
     */
    List<Product> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID продукта
     * @return - объект клиента с заданным ID, иначе null
     */
    Optional<Product> read(UUID id);

    /**
     * Обновляет продукт с заданным ID,
     * в соответствии с переданным продуктом
     * @param product - продукт в соответсвии с которым нужно обновить данные
     * @param id - id продукта который нужно обновить
     * @return - 1 если продукт был обновлён, иначе 0
     */
    int update(Product product, UUID id);

    /**
     * Удаляет продукт с заданным ID
     * @param id - id продукта, который нужно удалить
     * @return - 1 если продукт был удален, иначе 0
     */
    int delete(UUID id);
}

