package com.koreait.first.obj;

//객체는 멤버필드(명사로 네이밍)와 메소드(동사로 네이밍)로 이루어져 있다.
//대문자로 시작하는 것은 무조건 주소값을 저장함(String도 주소값 저장)

public class Car {	
	String name;	//멤버필드, 전역변수
	int cc;
	String color;
	
	public void drive() {	//메소드
		System.out.printf("%s 색상의 %dcc의 %s차량이 달린다.\n", color, cc, name);
	}
}
