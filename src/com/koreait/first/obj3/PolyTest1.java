package com.koreait.first.obj3;

public class PolyTest1 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B", 10);
		ClassA ca = cb;		//업캐스팅 자동형변환
		ca.print();
		Object obj = ca;
		
		ClassA ca2 = (ClassA)obj;	//다운캐스팅 형변환 해야함(자동X)
		ca2.print();
		
//		String str = (String)ca2;	//레퍼런스 변수끼리에서 형변환은 상속관계에서만 가능
		
		ClassB cb2 = (ClassB)ca2;	//다운캐스팅
		cb2.print();
		cb2.drive();

	}

}
