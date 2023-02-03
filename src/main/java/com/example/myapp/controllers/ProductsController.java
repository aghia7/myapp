package com.example.myapp.controllers;

import com.example.myapp.entities.Product;
import com.example.myapp.services.interfaces.IProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductsController {

    private final IProductService productService;

    public ProductsController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        return productService.getProductById(id).toString();
    }

    @PostMapping
    public String createProduct(@RequestBody Product product) {
        return productService.createProduct(product).toString();
    }

}
