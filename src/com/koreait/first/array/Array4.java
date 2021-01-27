package com.koreait.first.array;

import java.util.Arrays;

public class Array4 {
	//버블정렬
	public static void main(String[] args) {
		//선택정렬, 버블정렬 알고리즘 검색해보기!! 문제해결 능력 키우기
		int[] arr = {9, 7, 4, 5, 1, 3, 0};

//		int temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp;

		// 1, 3, 4, 5, 7

		for (int i = arr.length-1; i > 0; i--) {	//j+1을 할거기때문에 length-1

			for (int j = 0; j < i; j++) { //어짜피 젤 큰 수는 첫번째 실행때 정렬되기때문에 j<i
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
