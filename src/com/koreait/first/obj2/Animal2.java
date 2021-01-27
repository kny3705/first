package com.koreait.first.obj2;

public class Animal2 {
	private String name;
	private int age;
	
	public void setName(String name) {	//이상한 값이 주입되지 않도록 막는것이 가능하다
		this.name = name;	//this 뺄수없음
	}
	
	public String getName()	{	//외부로 주는것, return type이 String
		return this.name;	//this 빼도 되지만 쓰는걸 권장
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge()	{
		return this.age;
	}
	
	public void crying() {
		System.out.printf("%d살의 %s가 운다\n", age, name);
	}
}
