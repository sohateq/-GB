package ru.systempla.talos_server.model;

import javax.persistence.*;

@Entity
@Table(name = "info_data")
public class InfoData {

    private Integer infoId;
    private String name;
    private float weight;
    private float priceSv;
    private float priceRin;
    private float priceDzsl;

    public InfoData() {
    }

    public InfoData(Integer infoId, String name, float weight, float priceSv, float priceRin, float priceDzsl) {
        this.infoId = infoId;
        this.name = name;
        this.weight = weight;
        this.priceSv = priceSv;
        this.priceRin = priceRin;
        this.priceDzsl = priceDzsl;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_id", nullable = false)
    public Integer getInfoId() {
        return infoId;
    }

    @Column(name = "info_product_name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "info_weight", nullable = false)
    public float getWeight() {
        return weight;
    }

    @Column(name = "price_sv", nullable = false)
    public float getPriceSv() {
        return priceSv;
    }

    @Column(name = "price_rin", nullable = false)
    public float getPriceRin() {
        return priceRin;
    }

    @Column(name = "price_dzsl", nullable = false)
    public float getPriceDzsl() {
        return priceDzsl;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setPriceSv(float priceSv) {
        this.priceSv = priceSv;
    }

    public void setPriceRin(float priceRin) {
        this.priceRin = priceRin;
    }

    public void setPriceDzsl(float priceDzsl) {
        this.priceDzsl = priceDzsl;
    }
}
