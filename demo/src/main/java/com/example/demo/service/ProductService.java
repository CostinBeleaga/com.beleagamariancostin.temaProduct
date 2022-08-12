package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    final ProductRepository productRepository;

    public void addProduct(Product product)
    {
        productRepository.save(product);
    }

    public List<Product> getAllProduct() {return productRepository.findAll();}

    public void deleteProduct(Integer id)
    {
        Product p = productRepository.findById(id).get();
        p.setDeleted(true);
        productRepository.save(p);
    }

    public List<Product> getAllUndeletedProduct()
    {
        boolean deleted = false;
        return productRepository.getAllByDeleted(deleted);
    }
}
