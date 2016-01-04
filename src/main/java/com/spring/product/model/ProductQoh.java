package com.spring.product.model;

import java.io.Serializable;

public class ProductQoh implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long qohId;
	private Long productId;
	private int qty;
	
	public Long getQohId() {
		return qohId;
	}
	public void setQohId(Long qohId) {
		this.qohId = qohId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
