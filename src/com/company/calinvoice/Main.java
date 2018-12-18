package com.company.calinvoice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvoiceItem inv = new InvoiceItem(1, "mô tả hóa đơn 1", 1, "Chi tiết hóa đơn 1", 4, 5);
		inv.invoice();
		System.out.println("Tong gia tien cho chi tiet hoa don " + inv.calInvoice());
		System.out.println(inv.toString());
	}

}
