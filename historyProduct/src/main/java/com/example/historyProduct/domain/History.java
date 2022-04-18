package com.example.historyProduct.domain;

import javax.persistence.*;

@Entity
public class History {
    @Id
    @Column(name = "product_name")
    private String productName;
    @Column(name = "price")
    private int price;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    public History() {
    }

    public History(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "History{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
