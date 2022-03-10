package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Judo-gi", 2300000, "Second-hand", "/img/Judo-gi.jpg"));
        products.add(new Product(2, "Judo-Tatami", 130000, "New like", "/img/tatami.jpg"));
        products.add(new Product(3, "Judo-obi", 230000, "Old", "/img/kuro-obi.webp"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id)
                return products.get(i);
        }
        return null;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public void updateById(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                products.set(i, product);
                break;
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id)
                products.remove(i);
            break;
        }
    }
}
