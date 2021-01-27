package com.koreait.first.obj;

public class ObjTest5 {

	public static void main(String[] args) {
		//아래 NumberBox2를 객체화 하여
		//a = 10, b = 20을 넣고
		//sum() 메소드를 호출하여 리턴하는 값을 콘솔에 출력해 주세요!!

		NumberBox2 nbb2 = new NumberBox2();	//객체화, 레퍼런스 변수인 nnb2에 NumberBox2의 주소값을 복사, 다른객체의 주소값은 가질수 없음(type)
		//기능을 사용하려면 변수.~
		nbb2.a = 10; //값을 넣어주기
		nbb2.b = 20;
		
		NumberBox2 nbb22 = new NumberBox2();
		nbb22.a = 33;
		nbb22.b = 44;
		
		System.out.println("nbb2 : " + nbb2.sum());	//호출하기
		System.out.println("nbb22 : " + nbb22.sum());

	}

}

class NumberBox2 {
	int a;
	int b;
	
	int sum() {
		return a + b;
	}
}