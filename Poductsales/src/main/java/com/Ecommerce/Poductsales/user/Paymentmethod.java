package com.Ecommerce.Poductsales.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_method")
public class Paymentmethod {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="payment_id")
	private  int payment_id;
	@Column(name="upi_id")
	private String upi;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}

	

}
