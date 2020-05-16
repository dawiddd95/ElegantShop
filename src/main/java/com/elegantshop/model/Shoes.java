package com.elegantshop.model;

import com.elegantshop.model.enums.SkinType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Shoes extends LowerBodyProduct {

    public Shoes(String mark, String model, BigDecimal price, int productCount, LocalDateTime createdAt, SkinType skinType, int size) {
        super(mark, model, price, productCount, createdAt, skinType, size);
    }

    @Override
    public String toString() {
        return getBasicProductData()+", Skin type: "+this.getSkinType()+", Size: "+this.getSize();
    }
}
