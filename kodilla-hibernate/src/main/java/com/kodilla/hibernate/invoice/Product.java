package com.kodilla.hibernate.invoice;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	private int id;
	private String name;
	private Item item;

	public Product() {};

	public Product(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false, unique = true)
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
