package com.optimagrowth.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false)
	Long id;
	
	@Column(name = "product_title", nullable = false)
    String product_title;
	 
	@Column(name = "product_price", nullable = false)
    Double product_price;
	 
	@Column(name = "product_availability", nullable = false)
    int product_availability;
	 
	
	@Column(name = "product_stock", nullable = false)
    int product_stock;
	 
	
	@Column(name = "product_photo", nullable = false)
    String product_photo;
	 
	
	@Column(name = "product_weight", nullable = false)
    String product_weight;
	 
	
	@Column(name = "product_flavor", nullable = false)
    String product_flavor;
	 
	
	@Column(name = "product_brand", nullable = false)
    String product_brand;
	 
	
	@Column(name = "product_itemform", nullable = false)
    String product_itemform;
	 
	
	@Column(name = "product_ingredients", nullable = false)
    String product_ingredients;
	 
	
	@Column(name = "product_package", nullable = false)
    String product_package;
	 
	
	@Column(name = "product_info", nullable = false)
    String product_info;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProduct_title() {
		return product_title;
	}


	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}


	public Double getProduct_price() {
		return product_price;
	}


	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}


	public int getProduct_availability() {
		return product_availability;
	}


	public void setProduct_availability(int product_availability) {
		this.product_availability = product_availability;
	}


	public int getProduct_stock() {
		return product_stock;
	}


	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}


	public String getProduct_photo() {
		return product_photo;
	}


	public void setProduct_photo(String product_photo) {
		this.product_photo = product_photo;
	}


	public String getProduct_weight() {
		return product_weight;
	}


	public void setProduct_weight(String product_weight) {
		this.product_weight = product_weight;
	}


	public String getProduct_flavor() {
		return product_flavor;
	}


	public void setProduct_flavor(String product_flavor) {
		this.product_flavor = product_flavor;
	}


	public String getProduct_brand() {
		return product_brand;
	}


	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}


	public String getProduct_itemform() {
		return product_itemform;
	}


	public void setProduct_itemform(String product_itemform) {
		this.product_itemform = product_itemform;
	}


	public String getProduct_ingredients() {
		return product_ingredients;
	}


	public void setProduct_ingredients(String product_ingredients) {
		this.product_ingredients = product_ingredients;
	}


	public String getProduct_package() {
		return product_package;
	}


	public void setProduct_package(String product_package) {
		this.product_package = product_package;
	}


	public String getProduct_info() {
		return product_info;
	}


	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}
	
	
	
}
