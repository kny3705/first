package com.koreait.first.array;

public class Array {

	public static void main(String[] args) {
		int[] intArr = new int[900]; // 정수형 배열
//		intArr.length = 200; 상수라서 절대 바꿀수 없음
		System.out.println("intArr.length : " + intArr.length); // intArr은 객체가 됨, length는 객체가 아니고 기능 그 값은 바꾸지 못함
		intArr[0] = 100;

		int n1 = 100;

		System.out.println(n1);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);

		// boolean형의 배열 기본값은 false

		float[] floatArr = new float[10]; // 실수형 배열
		floatArr[0] = 10.1f;
		System.out.println(floatArr[0]);
		System.out.println(floatArr[1]);

		// 대문자로 시작하는것은 주소값을 저장할 수 있는 객체 기본값은 null
		String[] strArr = new String[10];
		System.out.println(strArr[0]);

		String str = "안녕";
		System.out.println(str);
//		str.

	}

}
