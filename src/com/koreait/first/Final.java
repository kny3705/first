package com.koreait.first;

public class Final {

	public static void main(String[] args) {
		int n1;

		n1 = 10;
		n1 = 20;
		n1 = 30;

		System.out.println(n1);

		final int n2 = 20; // 상수!!!
//		n2 = 30; 값을 절대 바꿀수 없음
		System.out.println(n2);
	}

}
