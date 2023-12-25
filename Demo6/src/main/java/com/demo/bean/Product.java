package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductTable101")
public class Product {

	@Id
	private int prodid;
	private String prodname;
	private double prodprice;

	public Product() {
	}

	public Product(int prodid, String prodname, double prodprice) {
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getProdprice() {
		return prodprice;
	}

	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}

	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodprice=" + prodprice + "]";
	}

}
