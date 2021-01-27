package com.koreait.first.inter;

public class InterFatherClass implements InterParent, InterGrand {
	//객체화 가능
	
	@Override
	public void print() {
		System.out.println("I'm your father.");
		
	}

}
