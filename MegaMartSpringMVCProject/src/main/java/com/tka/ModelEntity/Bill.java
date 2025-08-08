package com.tka.ModelEntity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int billId;
	double totalAmount;
	
	@OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
	public List<Product> products;
	
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
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", totalAmount=" + totalAmount + "]";
	}
		
	
}
