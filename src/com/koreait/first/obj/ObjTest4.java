package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest4 {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 9, 3, 5 }; // int[] 레퍼런서 변수(참조 변수) - 주소값이 저장된다(1개의 값만)

		int[] arr3 = arr; // 얕은 복사라고 칭한다. 주소값 복사

		// 배열 복사하는 메소드(깊은 복사)
		int[] arr2 = copyArr(arr);	// =이 있다면 무조건 void가 아님(비보이드 형)
		// System.out.println(copyArr(arr)); - 비보이드 형

		orderBy(arr2);

		System.out.println(Arrays.toString(arr)); // {4, 7, 1, 9, 3}
		System.out.println(Arrays.toString(arr2)); // {1, 3, 4, 7, 9}

	}

	public static int[] copyArr(int[] arr) {
		int[] array = new int[arr.length];	//새로운 주소값을 생성

		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i]; // 값을 복사하여 넣어준다 주소값은 다름
		}

		return array;
	}

	public static void orderBy(int[] arr) {
		Arrays.sort(arr);
	}

}
