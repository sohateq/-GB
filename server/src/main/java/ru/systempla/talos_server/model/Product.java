package ru.systempla.talos_server.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    private Integer id;

    private String name;
    private String source;
    private String status;
    private long count;

    public Product() {
    }

    public Product(Integer id, String name, String source, String status, long count) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.status = status;
        this.count = count;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "product_name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "product_source", nullable = false)
    public String getSource() {
        return source;
    }

    @Column(name = "product_status", nullable = false)
    public String getStatus() {
        return status;
    }

    @Column(name = "product_count", nullable = false)
    public long getCount() {
        return count;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
