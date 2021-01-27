package com.koreait.first.test;

public class MyArrayList {
	private int[] arr; // 전역변수는 private

	public MyArrayList() {
		init();
	}

	public void init() {
		arr = new int[0]; // 값을 저장할 수 없음
	}

	public void add(int val) {
		int[] temp = new int[arr.length + 1];
		temp[arr.length] = val;

		// arr값을 temp에 넣어줘야 함
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp; // temp의 값을 arr에 넣어준다
	}

	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1];
		temp[idx] = val;
		
		for (int i = 0; i < arr.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];	//idx보다 작다면 그대로 복사
			} else {
				temp[i+1] = arr[i];	//idx보다 한칸씩 뒤로 복사
			}		
//			temp[i<idx ? i : i + 1] = arr[i]; - if문 한줄로
		}	
		arr = temp;
	}

	public int get(int idx) {
		return arr[idx];
	}

	public int remove(int idx) {
		int del = arr[idx];	//바뀌기 전에 값을 저장해서 return
		
		int[] temp = new int[arr.length-1];	//arr.length의 배열 보다 1칸 줄어 들어야 함
		
		for (int i = 0; i < temp.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];	//작을 때 그대로 복사
			} else {
				temp[i] = arr[i+1];	//arr값을 한칸 씩 가져와서 복사
			}
			//tmep[i] = arr[i < idx ? i : i + 1];
		}
		
		arr = temp;
		
		return del;
	}
	
//	@Override
//	public String toString() {
//		String str = "[";
//		
//		for(int i = 0; i < arr.length; i++) {
//			str += arr[i] + (i < arr.length-1 ?  ", " : "]");
//		}
//		return str;
//	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			
			if(i < arr.length-1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
		
	}
}
