package com.company.calinvoice;

public class InvoiceItem extends Invoice {
	
	private int idItem;
	private String descItem;
	private int qty;
	private double unitPrice;
	
    public InvoiceItem(int id,String desc,int idItem,String descItem,int qty,double unitPrice) {
		// TODO Auto-generated constructor stub
    	super(id,desc);
    	this.idItem = idItem;
    	this.descItem = descItem;
    	this.qty = qty;
    	this.unitPrice = unitPrice;
	} 
		
	public int getId() {
		return idItem;
	}
	public void setId(int idItem) {
		this.idItem = idItem;
	}
	public String getDesc() {
		return descItem;
	}
	public void setDesc(String descItem) {
		this.descItem = descItem;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void invoice() {
		System.out.println("Id of Invoice " +id);
		System.out.println("Desc of Invoice " +desc);
	}
	
	// Tinh tong tien hoa don unitPrice * qty
	
	public double calInvoice(){
		return unitPrice * qty;
	}
	@Override
	public String toString() {
		return "Invoice[idItem = " + idItem + ", descItem = " + descItem + ", qty = " + qty + ", unitPrice = "+unitPrice + ", id = "+id +"]";
	}
	
}
