package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest3 {

	public static void main(String[] args) {
		//파괴메소드
		int[] arr = { 4, 7, 1, 9, 3 };	//배열은  타입과 상관없이 객체
		//int arr[]
		//arr을 정렬하는 orderBy메소드를 정의해 주세요.
		orderBy(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void orderBy(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int least = i;
			for(int j=i+1; j<arr.length; j++) {	//최소값 찾기
				if(arr[least] > arr[j]) {	
					least = j;
				}
			}
			
			if(i != least) {	//자리 바꾸기
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		//Arrays.sort(arr); 작은숫자부터 정렬
		
	}
	
}

