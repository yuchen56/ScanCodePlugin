package com.scan.mode;

import java.io.Serializable;

/**
 * Read Code
 * */
public class Barcodemode implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Number="";
	private String Barcode = "";
    private String CountNo ="";
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getBarcode() {
		return Barcode;
	}
	public void setBarcode(String barcode) {
		Barcode = barcode;
	}
	public String getCountNo() {
		return CountNo;
	}
	public void setCountNo(String countNo) {
		CountNo = countNo;
	}
	@Override
	public String toString() {
		return "barcodemode [Number=" + Number + ", Barcode=" + Barcode
				+ ", CountNo=" + CountNo + "]";
	}
    
    
	
	
}
