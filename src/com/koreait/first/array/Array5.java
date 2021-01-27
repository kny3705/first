package com.koreait.first.array;

import java.util.Arrays;

public class Array5 {
	// 선택정렬
	public static void main(String[] args) {
		int[] arr = { 9, 7, 4, 5, 1, 3, 0 };

//		for(int i = 0; i<arr.length-1; i++) {	//퍼포먼스가 떨어짐...
//			
//			for(int j = i+1; j<arr.length; j++) {
//				
//				if(arr[i] > arr[j]) { //자리 바꾸기
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			int least = i;
			for (int j = i + 1; j < arr.length; j++) { // 최소값 찾기
				if (arr[least] > arr[j]) {
					least = j;
				}
			}

			if (i != least) { // 자리 바꾸기
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
