package com.example.myapp.services;

import com.example.myapp.entities.Product;
import com.example.myapp.repositories.ProductRepository;
import com.example.myapp.services.interfaces.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getReferenceById(id);
    }
}
