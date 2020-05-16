package com.elegantshop.model;

import com.elegantshop.model.enums.ColorShoes;
import com.elegantshop.model.enums.SkinType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Shoes extends LowerBodyProduct {
    private ColorShoes colorShoes;

    public Shoes(String mark, String model, BigDecimal price, int productCount, LocalDateTime createdAt, SkinType skinType, int size) {
        super(mark, model, price, productCount, createdAt, skinType, size);
        this.colorShoes = colorShoes;
    }

    protected String getBasicShoesData() {
        return getBasicLowerBodyProductData()+", Shoes color: "+colorShoes;
    }

    @Override
    public String toString() {
        return getBasicShoesData();
    }
}
