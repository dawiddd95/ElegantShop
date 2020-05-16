package com.elegantshop.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private String mark;
    private String model;
    private BigDecimal price;
    private int productCount;
    private LocalDateTime createdAt;

    private Product(String mark,String model, BigDecimal price, int productCount, LocalDateTime createdAt) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.productCount = productCount;
        this.createdAt = createdAt;
    }

    public static class Builder {
        private String mark;
        private String model;
        private BigDecimal price;
        private int productCount;
        private LocalDateTime createdAt;

        public Builder() { }

        public Builder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setProductCount(int productCount) {
            this.productCount = productCount;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Product build() {
            return new Product(mark, model, price, productCount, createdAt);
        }
    }

    protected Product(Builder builder) {
        mark = builder.mark;
        model = builder.model;
        price = builder.price;
        productCount = builder.productCount;
        createdAt = builder.createdAt;
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

    @Override
    public String toString() {
        return "Model: "+this.model+", Marka: "+this.mark+", cena: "+this.price+", ilosc: "+this.productCount+", dodane: "+this.createdAt;
    }
}
