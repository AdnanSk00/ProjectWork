package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Bill {
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int billId;
	double totalAmount;
	
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	
	public Bill(double totalAmount) {
        this.totalAmount = totalAmount;
    }
	
	public int getBillId() {
		return billId;
	}
	
	public void setBillId(int billId) {
		this.billId = billId;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", totalAmount=" + totalAmount + "]";
	}
		
	
}
