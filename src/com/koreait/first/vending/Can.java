package com.koreait.first.vending;

public class Can {
	private final String nm;	//final을 쓴다면 생성자로만 값을 넣어줄 수 있음
	private final int price;
	
	public Can(String nm, int price) {
		this.nm = nm;
		this.price = price;
	}

	public String getNm() {
		return nm;
	}

	public int getPrice() {
		return price;
	}
	
}
