package com.Ecommerce.Poductsales.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="txn_id")
	private long txn_id;
	@Column(name="txn_date")
	private String date;
	@Column(name="txn_amnt")
	private float txn_amnt;
	@Column(name="payment_type")
	private String payment_type;
	
	
	public long getTxn() {
		return txn_id;
	}
	public void setTxn(long txn_id) {
		this.txn_id = txn_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getTxn_amnt() {
		return txn_amnt;
	}
	public void setTxn_amnt(float txn_amnt) {
		this.txn_amnt = txn_amnt;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	
	

}
