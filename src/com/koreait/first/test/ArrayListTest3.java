package com.koreait.first.test;

import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1, 500);
		
		String result = list.toString() + "ddd";
		System.out.println(result);
		
		System.out.println(list.get(0));	//100
		System.out.println(list.get(1));	//500
		System.out.println(list.get(2));	//200
		System.out.println(list.get(3));	//300
		
		System.out.println("--del : " + list.remove(1));	//--del : 500
		System.out.println(list.get(0));	//100
		System.out.println(list.get(1));	//200
		System.out.println(list.get(2));	//300
		
		System.out.println(list);	//println 특성을 이용한 것
		
		

	}

}
