package com.optimagrowth.product.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimagrowth.product.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>  {
    public Optional<Product> findById(Long productId);
}
