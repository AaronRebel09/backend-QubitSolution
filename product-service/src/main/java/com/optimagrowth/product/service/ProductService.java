package com.optimagrowth.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimagrowth.product.model.Product;
import com.optimagrowth.product.repository.ProductRepository;

@Service
public class ProductService {
	
    @Autowired
    private ProductRepository repository;

    public Product findById(Long ProductId) {
    	Optional<Product> opt = repository.findById(ProductId);
        return (opt.isPresent()) ? opt.get() : null;
    }

    public Product create(Product Product){    	
        Product = repository.save(Product);
        return Product;

    }

    public void update(Product Product){
    	repository.save(Product);
    }

    public void delete(Long id){
    	repository.deleteById(id);
    }
}