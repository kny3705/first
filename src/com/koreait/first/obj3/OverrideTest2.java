package com.koreait.first.obj3;

public class OverrideTest2 {

	public static void main(String[] args) {
		//다형성
		//1. 부모 타입은 자식 객체 주소값 참조할 수 있다.(가리킬 수 있다, 자식 객체 주소값 저장할 수 있다.)
		ClassA ca = new ClassB("B", 20);
		//2. 자식 타입은 부모 객체 주소값 참조할 수 없다.(가리킬 수 없다, 부모 객체 주소값 저장할 수 없다.)
//		ClassB cb = new ClassA("A", 10)
		//3. 타입은 메서드를 호출할 수 있냐 없냐만 결정(즉, 자기가 알고 있는 메소드만 호출할 수 있다.)
		//	  실제로 실행되는 메소드는 객체 기준이다.
//		ca.print();

		ClassB cb = (ClassB)ca;	//다운캐스팅은 형변환
		cb.drive();
		
		ClassA ca2 = cb;

	}

}