package com.example.myapp.services.interfaces;

import com.example.myapp.entities.Product;

public interface IProductService {
    Product createProduct(Product product);
    Product getProductById(int id);
}
