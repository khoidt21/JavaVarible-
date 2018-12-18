package com.company.calinvoice;

abstract class Invoice {
	
	public int id;
	public String desc;
	
	public Invoice(int id, String desc) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.desc = desc;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public abstract void invoice();
	
	@Override
	public String toString() {
		return "Invoice[id=" + id + "desc=" + desc + "]";
	}
	
	
}
