package com.educandoweb.course.dto;

import com.educandoweb.course.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private String descripion;
	private Double price;
	private String imgUrl;

	public ProductDTO() {

	}

	public ProductDTO(Long id, String name, String descripion, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.descripion = descripion;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public ProductDTO(Product entity) {

		this.id = entity.getId();
		this.name = entity.getName();
		this.descripion = entity.getDescripion();
		this.price = entity.getPrice();
		this.imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Product toEntity() {
		return new Product(id, name, descripion, price, imgUrl);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
