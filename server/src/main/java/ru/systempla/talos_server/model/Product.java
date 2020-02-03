package ru.systempla.talos_server.model;

import java.util.UUID;

public class Product {

    private final UUID id;

    private String name;
    private String source;
    private String status;
    private long count;

    public Product(UUID id, String name, String source, String status, long count) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.status = status;
        this.count = count;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getStatus() {
        return status;
    }

    public long getCount() {
        return count;
    }
}
