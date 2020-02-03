package ru.systempla.talos_server.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    private Integer orderId;
    private String clientName;
    private LocalDate creationDate;
    private LocalDate acceptionDate;
    private LocalDate returnDate;
    private long typeOneCount;
    private long typeTwoCount;
    private long typeThreeCount;
    private long typeFourCount;
    private long typeFiveCount;
    private long typeSixCount;
    private long typeSevenCount;
    private String orderStatus;

    public Order() {
    }

    public Order(Integer orderId, String clientName, LocalDate creationDate, LocalDate acceptionDate, LocalDate returnDate,
                 long typeOneCount, long typeTwoCount, long typeThreeCount, long typeFourCount, long typeFiveCount,
                 long typeSixCount, long typeSevenCount, String orderStatus) {
        this.orderId = orderId;
        this.clientName = clientName;
        this.creationDate = creationDate;
        this.acceptionDate = acceptionDate;
        this.returnDate = returnDate;
        this.typeOneCount = typeOneCount;
        this.typeTwoCount = typeTwoCount;
        this.typeThreeCount = typeThreeCount;
        this.typeFourCount = typeFourCount;
        this.typeFiveCount = typeFiveCount;
        this.typeSixCount = typeSixCount;
        this.typeSevenCount = typeSevenCount;
        this.orderStatus = orderStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    public Integer getOrderId() {
        return orderId;
    }

    @Column(name = "client_name", nullable = false)
    public String getClientName() {
        return clientName;
    }

    @Column(name = "creation_date", nullable = false)
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Column(name = "acception_date")
    public LocalDate getAcceptionDate() {
        return acceptionDate;
    }

    @Column(name = "return_date")
    public LocalDate getReturnDate() {
        return returnDate;
    }

    @Column(name = "count_one", nullable = false)
    public long getTypeOneCount() {
        return typeOneCount;
    }

    @Column(name = "count_two", nullable = false)
    public long getTypeTwoCount() {
        return typeTwoCount;
    }

    @Column(name = "count_three", nullable = false)
    public long getTypeThreeCount() {
        return typeThreeCount;
    }

    @Column(name = "count_four", nullable = false)
    public long getTypeFourCount() {
        return typeFourCount;
    }

    @Column(name = "count_five", nullable = false)
    public long getTypeFiveCount() {
        return typeFiveCount;
    }

    @Column(name = "count_six", nullable = false)
    public long getTypeSixCount() {
        return typeSixCount;
    }

    @Column(name = "count_seven", nullable = false)
    public long getTypeSevenCount() {
        return typeSevenCount;
    }

    @Column(name = "order_status", nullable = false)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setAcceptionDate(LocalDate acceptionDate) {
        this.acceptionDate = acceptionDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setTypeOneCount(long typeOneCount) {
        this.typeOneCount = typeOneCount;
    }

    public void setTypeTwoCount(long typeTwoCount) {
        this.typeTwoCount = typeTwoCount;
    }

    public void setTypeThreeCount(long typeThreeCount) {
        this.typeThreeCount = typeThreeCount;
    }

    public void setTypeFourCount(long typeFourCount) {
        this.typeFourCount = typeFourCount;
    }

    public void setTypeFiveCount(long typeFiveCount) {
        this.typeFiveCount = typeFiveCount;
    }

    public void setTypeSixCount(long typeSixCount) {
        this.typeSixCount = typeSixCount;
    }

    public void setTypeSevenCount(long typeSevenCount) {
        this.typeSevenCount = typeSevenCount;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
