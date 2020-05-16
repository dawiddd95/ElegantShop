package com.elegantshop.model;

import com.elegantshop.model.enums.SkinType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LowerBodyProduct extends Product {
    private SkinType skinType;
    private int size;

    public LowerBodyProduct(String mark, String model, BigDecimal price, int productCount, LocalDateTime createdAt, SkinType skinType, int size) {
        super(mark, model, price, productCount, createdAt);
        this.skinType = skinType;
        this.size = size;
    }

    public SkinType getSkinType() {
        return skinType;
    }

    public int getSize() {
        return size;
    }
}
