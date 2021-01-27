package com.koreait.first.obj3;

public class ClassC extends ClassB {

	public ClassC(String name, int age) {
		super(name, age);	//ClassB에 있는 생성자 호출
	}
	
	@Override
	public void print()	 {
		System.out.println("C : " + getName() + "-" + getAge());
	}

}
