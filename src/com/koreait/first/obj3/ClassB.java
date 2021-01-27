package com.koreait.first.obj3;

public class ClassB extends ClassA {
	public ClassB(String name, int age) {
		super(name, age);	//ClassA에 있는 생성자 호출
	}
	
	@Override	//있으면 쓰고 없으면 위로 올라감
	public void print()	 {
//		super.print();	//부모꺼 호출
		System.out.println("B : " + getName() + "/" + getAge());
				//getName() = this.getName() = super.getName() 값출력은 같다
	}
	
	public void drive() {
		System.out.println("driving!!");
	}
}
