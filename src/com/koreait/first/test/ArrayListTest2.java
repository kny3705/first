package com.koreait.first.test;

import java.util.LinkedList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();	//list는 인터페이스 부모, int형의 정수형 클래스, 가리키는 타입만 맞춰주기
		//ArrayList 읽기 위주는 메모리적으로 유리
		//LinkedList 수정,삭제가 많다면 메모리적으로 유리
		list.add(1);
		
		int a = list.get(0);
		
		System.out.println("a : " + a);
		
//		list.add("1");
//		list.add(true);
//		list.add(1.1);		//파라미터는 오브젝트 타입
//		
//		Object obj = 1;
//		obj = "1";
//		obj = true;
//		obj = 1.1;

	}

}
