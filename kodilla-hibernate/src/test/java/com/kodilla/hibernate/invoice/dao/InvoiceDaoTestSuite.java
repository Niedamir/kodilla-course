package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
	@Autowired
	private InvoiceDao invoiceDao;

	@Test
	public void testInvoiceDaoSave() {
		//Given
		Product product1 = new Product("buty");
		Product product2 = new Product("płaszcz");
		Product product3 = new Product("kapelusz");
		Item item1 = new Item(new BigDecimal("99.99"), 1, new BigDecimal("99.99"));
		Item item2 = new Item(new BigDecimal("149.99"), 1, new BigDecimal("149.99"));
		Item item3 = new Item(new BigDecimal("54.99"), 2, new BigDecimal("109.98"));
		product1.setItem(item1);
		product2.setItem(item2);
		product3.setItem(item3);
		Invoice invoice = new Invoice("FV 01/01");
		invoice.getItems().add(item1);
		invoice.getItems().add(item2);
		invoice.getItems().add(item3);
		item1.setInvoice(invoice);
		item2.setInvoice(invoice);
		item3.setInvoice(invoice);

		//When
		invoiceDao.save(invoice);
		int id = invoice.getId();

		//Then
		Assert.assertNotEquals(0, id);

		//CleanUp
		invoiceDao.deleteById(id);

	}
}