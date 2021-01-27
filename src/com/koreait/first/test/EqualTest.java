package com.koreait.first.test;

public class EqualTest {

	public static void main(String[] args) {
		ValueBox v1 = new ValueBox(10);
		ValueBox v2 = new ValueBox(10);
		
		System.out.println(v1 == v2); //레퍼런스 변수끼리 == 비교는 주소값 비교 false
		System.out.println(v1.equals(v2));	//false
	}

}
