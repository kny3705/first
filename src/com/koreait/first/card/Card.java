package com.koreait.first.card;

//모양 shape (spade, heart, clover, diamond)
//번호 value (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
public class Card {
	private String shape;
	private String value;
	
	public Card(String shape, String value) {
		this.shape = shape;
		this.value = value;
	}
	
	@Override
	public String toString() {
		StringBuilder cd = new StringBuilder(shape);
		cd.append(" (");
		cd.append(value);
		cd.append(")");		
		return cd.toString();
//		return String.format("%s (%s)", shape, value);
	}
}
