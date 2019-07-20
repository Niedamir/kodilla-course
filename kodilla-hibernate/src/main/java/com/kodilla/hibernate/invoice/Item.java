package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
	private int id;
	private int quantity;
	private BigDecimal price;
	private BigDecimal value;
	private Invoice invoice;

	private Product product;

	public Item() {};

	public Item(BigDecimal price, int quantity, BigDecimal value) {
		this.price = price;
		this.quantity = quantity;
		this.value = value;
	}

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false, unique = true)
	public int getId() {
		return id;
	}
	@Column(name = "PRICE")
	public BigDecimal getPrice() {
		return price;
	}
	@Column(name = "QUANTITY")
	public int getQuantity() {
		return quantity;
	}
	@Column(name = "VALUE")
	public BigDecimal getValue() {
		return value;
	}

	private void setId(int id) {
		this.id = id;
	}
	private void setprice(BigDecimal price) {
		this.value = price;
	}
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private void setValue(BigDecimal value) {
		this.value = value;
	}

	@OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "PRODUCT")
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne
	@JoinColumn (name = "ITEM")
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
