package com.elegantshop.model;

import com.elegantshop.model.enums.ColorShoes;
import com.elegantshop.model.enums.SkinType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Belt extends LowerBodyProduct {
    private String color;

    public Belt(String mark, String model, BigDecimal price, int productCount, LocalDateTime createdAt, SkinType skinType, int size, String color) {
        super(mark, model, price, productCount, createdAt, skinType, size);
        this.color = "Black";
    }

    protected String getBasicBeltData() {
        return getBasicLowerBodyProductData()+", Shoes color: "+color;
    }

    @Override
    public String toString() {
        return getBasicBeltData();
    }
}
