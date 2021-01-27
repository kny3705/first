package com.koreait.first;


//클래스 바깥에 쓸 수 있는 키워드는 package, import 밖에 없다.
//즉, 메소드, 변수는 무조건, 무조건, 무조건 클래스 안에 있어야 한다.
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
	}
}

/* 
 이렇게 쓸 수 없다
int a =10;

public static void main(String[] args) {
	
}
 
 */