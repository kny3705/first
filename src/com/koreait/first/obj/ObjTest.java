package com.koreait.first.obj;

public class ObjTest { // 파일명이랑 클래스명이 같을때만 public을 붙일수 있다

	public static void main(String[] args) {
		int mNum = 10;	//메소드 안에서 선언된 변수는 지역변수

		NumberBox nbx = new NumberBox();
		nbx.num = 10;
		nbx.str = "Hello";
		
		changeVal(mNum);
		changeVal(nbx);
		changeVal2(nbx);
		
		System.out.println("mNum : " + mNum);
		System.out.println("nbx.num : " + nbx.num);
		System.out.println("nbx.str : " + nbx.str);

	}
	
	public static void changeVal(int num) {	//int num과 int mNum(int num오르 바꾸더라도 다른 존재)은 서로 다른 존재이고 각각의 메모리를 저장
		num = 20;
	}
	
	public static void changeVal(NumberBox pNbx) {	//nbx와 pNbx는 다른 존재이지만 같은 주소값을 가지고 있다
//		pNbx = new NumberBox(); // 새 주소값을 넣어 준다면 서로 다른 주소값을 가지게 되므로 10출력
		pNbx.num = 20;
	}
	
	public static void changeVal2(NumberBox pNbx) {	//(String str)로 하게되면 서로 다른 존재이기 때문에 변하지 않음
		pNbx.str = "ddd";
//		str = "ddd";	//새로운 String 주소값을 만든것
	}

}

class NumberBox { // public 사용 불가능
	int num;
	String str;

}
