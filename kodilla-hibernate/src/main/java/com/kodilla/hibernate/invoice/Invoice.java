package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
	private int id;
	private String number;
	private List<Item> items = new ArrayList<>();

	public Invoice() {}

	public Invoice(String number) {
		this.number = number;
	}

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false, unique = true)
	public int getId() {
		return id;
	}
	@Column(name = "NUMBER")
	public String getNumber() {
		return number;
	}

	private void setId(int id) {
		this.id = id;
	}
	private void setNumber(String number) {
		this.number = number;
	}

	@OneToMany (targetEntity = Item.class, mappedBy = "items", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<Item> getItems() {
		return items;
	}
	private void setItems(List<Item> items) {
		this.items = items;
	}
}
