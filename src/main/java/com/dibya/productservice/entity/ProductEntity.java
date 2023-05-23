package com.dibya.productservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="product_serviceinfo")
public class ProductEntity  implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="alt_key")
	private Long altKey;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private Double price;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="description")
	private String description;
	public Long getAltKey() {
		return altKey;
	}
	public void setAltKey(Long altKey) {
		this.altKey = altKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProductEntity [altKey=" + altKey + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + "]";
	}
	
	

}
