package com.Ecommerce.Poductsales.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Productdetails")
public class Productdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_code")
	private int itemcode;
	@Column(name="item_name")
	private String itemname;
	@Column(name="size")
	private String size;
	@Column(name="colour")
	private String colour;
	@Column(name="quantity")
	private int quantity;
	@Column(name="cost")
	private float cost;

	
	@ManyToOne
	@JoinColumn(name = "User_id", referencedColumnName = "User_id")
	private Userdetails user;
	
	public Userdetails getUser() {
		return user;
	}
	public void setUser(Userdetails user) {
		this.user = user;
	}
	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
