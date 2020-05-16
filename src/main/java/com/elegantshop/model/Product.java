package com.elegantshop.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private String mark;
    private String model;
    private BigDecimal price;
    private int productCount;
    private LocalDateTime createdAt;

    public Product(String mark,String model, BigDecimal price, int productCount, LocalDateTime createdAt) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.productCount = productCount;
        this.createdAt = createdAt;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getProductCount() {
        return productCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    protected String getBasicProductData() {
        return "Model: "+this.model+", Marka: "+this.mark+", cena: "+this.price+", ilosc: "+this.productCount+", dodane: "+this.createdAt;
    }

    @Override
    public String toString() {
        return getBasicProductData();
    }
}
