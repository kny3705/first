package com.koreait.first.abst;

public class AbstractTest {

	public static void main(String[] args) {
//		AbstA aa = new AbstA();	//객체화할  수 없다
		//객체화를 막는 방법 2가지
		//추상 클래스(abstract)를 쓴다면 객체화 할 수 없다
		//기본생성자에 private를 쓴다면 객체화 할 수 없다
		
		AbstA aa = new AbstB();
		aa.bark();	// 호출되는 기준은 객체
		
		AbstB ab = (AbstB)aa;
		ab.shakeTail();
		
		((AbstB)aa).shakeTail();	//일회성

	}

}
