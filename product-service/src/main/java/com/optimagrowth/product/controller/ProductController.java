package com.optimagrowth.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.optimagrowth.product.model.Product;
import com.optimagrowth.product.service.ProductService;

@RestController
@RequestMapping(value="v1/Product")
public class ProductController {
    @Autowired
    private ProductService service;


    @RequestMapping(value="/{ProductId}",method = RequestMethod.GET)
    public ResponseEntity<Product> getProduct( @PathVariable("ProductId") Long ProductId) {
        return ResponseEntity.ok(service.findById(ProductId));
    }

    @RequestMapping(value="/{ProductId}",method = RequestMethod.PUT)
    public void updateProduct( @PathVariable("ProductId") Long id, @RequestBody Product Product) {
    	Product.setId(id);
        service.update(Product);
    }

    @PostMapping
    public ResponseEntity<Product>  saveProduct(@RequestBody Product Product) {
    	return ResponseEntity.ok(service.create(Product));
    }

    @RequestMapping(value="/{ProductId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct( @PathVariable("ProductId") Long id) {    	
        service.delete(id);
    }

}
