package com.koreait.first.abst;

public abstract class AbstA {	
	//추상 메서드를 하나이상 가지고 있으면 클래스 앞에도 무조건 붙여줘야 한다(추상 메서드를 가지고 있지 않아도 붙일 수 있다)
	//추상 클래스는 객체화 할 수 없다(구현부가 없음)
	//부모 타입으로만 역할
	//추상 클래스는 나를 상속하는것이 있음
	public abstract void bark();	//선언부
	public void print() {	//선언부
		System.out.println("HI I'm A");	//구현부
	}
}
