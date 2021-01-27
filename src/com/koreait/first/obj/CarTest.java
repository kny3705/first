package com.koreait.first.obj;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();	//객체화 키워드 new가 Car를 객체화 하고 주소값을 리턴 - 객체화 하기 (인스턴스)
		car1.name = "페라리";		//주소값.기능 사용 가능 (멤버필드 - 값 저장, 메소드 - 실행)
		car1.cc = 5000;
		car1.color = "붉은색";
		
		Car car2 = new Car();
		car2.name = "포르쉐";
		car2.cc = 3500;
		car2.color = "블랙";
		
		car1.drive();	//객체 하나를 돌려쓰는게 아님
		car2.drive();
		
		System.out.println(car1 == car2);	//주소값 비교 false

	}

}
