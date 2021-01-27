package com.koreait.first.obj2;

public class Animal {

	String name;
	int age;
	
	public Animal() {	//생성자와 메소드가 차이점 - 생성자는 클래스명과 똑같아야하고 리턴타입이 없어야 한다
		this("바둑이");	//this() - 생성자  호출
//		System.out.println("-- Animal 기본 생성자() --");
	}
	
	public Animal(String name) {
		this(name,2);
	}
	
	public Animal(int age) {
		this("바둑이", age);
	}
	
	public Animal(String name, int age) {
		super();			//생략가능 super 밑으로 적어야함
		this.name = name;	//this(나 자신의 주소값).~ - 메소드 호출
		this.age = age;		//변수명이 다를경우에는 this를 안써도됨
//		this.crying();		//crying(); this 빼고 써도 가능
	}
	
	public void crying() {
		System.out.printf("%d살의 %s가 운다\n", age, name);
	}

}
