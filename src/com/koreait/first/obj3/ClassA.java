package com.koreait.first.obj3;

public class ClassA {
	private String name;
	private int age;
	
	public ClassA(String a, int b) {	//생성자로 외부로부터 외부에 값을 넣는 방법
		System.out.println("ClassA 생성자");
		this.name = a;	//name 가까이 있는것 기준
		this.age = b;
//		this.print();	//메소드는 객체 기준 자신 this
	}
	
	public void print() {
		System.out.println("A : " + name + "," + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
