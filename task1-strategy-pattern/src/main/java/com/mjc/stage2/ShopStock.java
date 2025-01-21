package com.mjc.stage2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy) {

        List<Product> filteredProductList = new ArrayList<>();

        for (Product product : productList) {
            boolean filter = filteringStrategy.filter(product);
            if (filter) {
                filteredProductList.add(product);
            }
        }
        return filteredProductList;
    }
}
