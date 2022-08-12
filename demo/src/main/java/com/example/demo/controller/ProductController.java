package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(path="/product")
    public void addProduct(@RequestBody Product product)
    {
        product.setDeleted(false);
        productService.addProduct(product);
    }

    @GetMapping("/product")
    public List<Product> getAllProduct() { return productService.getAllProduct();}

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable(value="id") Integer id) {productService.deleteProduct(id);}

    @GetMapping("/product/undeleted")
    public List<Product> getAllUndeletedProduct() { return productService.getAllUndeletedProduct();}

}