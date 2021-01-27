package com.koreait.first.obj2;

//부모 보다는 자식이 가지고 있는 소스의 양이 많아 진다
public class ClassA {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

class ClassB extends ClassA {
	private int age;

	ClassB() {
		System.out.println("ClassB 생성자");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class ClassC extends ClassB {
	public ClassC(String name, int age) {	//생성자
		super();		//부모의 기본생성자 호출
		System.out.println("ClassC 생성자");
		setName(name);	//메소드 호출
		setAge(age);
	}

	public void print() {
		System.out.printf("저는 %s이고, 나이는 %d 입니다.\n", getName(), getAge());
	}
	
}

class ClassD extends ClassC {
	public ClassD(String name, int age) {
		super(name, age);	//부모 ClassC는 생성자가 있고 기본생성자가 생성되지 않으므로 따로 만들어 준다.
	}
	
//	애노테이션
	
	@Override	
	public void print() {
		System.out.printf("I'm %s, My age is %d\n", getName(), getAge());
	}

	public void ddd() {
		System.out.println("ddd");
		
	}
}