package com.koreait.first.obj;

import java.io.PrintStream;

public class StaticTest1 {

	// static은 멤버필드 앞(전역변수), 메소드 앞에 붙일수 있다.
	// 멤버필드 앞에 static 쓰일때 변수는 객체가 아무리 많아도 하나의 값 밖에 저장 못한다
	// 가능한 붙이는걸 지향하지만, 절대 메소드 앞에 붙이면 안되는 경우만 따로 알기

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.country = "Korea"; // 써도 되긴 하지만 이렇게 사용하지 않음
		tv1.brand = "Samsung";
		tv1.inch = 50;
		tv1.printMe();

		Tv tv2 = new Tv();
		tv2.country = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;

		Tv.country = "France"; // 클래스명.~ 로 접근하는게 정석

		tv2.printMe();
		tv1.printMe();

		PrintStream ps = System.out; // 대표적 static
		ps.println("dddd");
	}

}

class Tv {
	static String country;
	String brand;
	int inch;

	void printMe() {	// static 멤버변수들끼리 사용된 경우에만 static을 붙일수 있다
		System.out.printf("%s나라의 %s회사의 %d인치 Tv입니다.\n", country, brand, inch);
	}
	
	static String whereCountry() {
		return country;
	}
	
	static int sum(int n1, int n2) {
		return n1 + n2;
	}

}