package com.koreait.first.abst;

public class AbstB extends AbstA{

	@Override
	public void bark() {	//무조건 오버라이딩 해야한다
		System.out.println("멍멍!");
		
	}
	
	public void shakeTail() {
		System.out.println("살랑~ 살랑~");
	}

}
