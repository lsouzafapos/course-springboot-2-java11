package com.educandoweb.course.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.educandoweb.course.entities.Product;

public class ProductCategoriesDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String descripion;
	private Double price;
	private String imgUrl;

	private List<CategoryDTO> categories = new ArrayList<>();

	public ProductCategoriesDTO() {

	}

	public ProductCategoriesDTO(String name, String descripion, Double price, String imgUrl) {
		this.name = name;
		this.descripion = descripion;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public ProductCategoriesDTO(Product entity) {
		this.name = entity.getName();
		this.descripion = entity.getDescripion();
		this.price = entity.getPrice();
		this.imgUrl = entity.getImgUrl();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public Product toEntity() {
		return new Product(null, name, descripion, price, imgUrl);
	}

}
