package com.koreait.first.obj2;

public class CapsuleTest {

	public static void main(String[] args) {
		//접근지시어
		//private, default, protected, public
		
		//private : class
		//default : class, package
		//protected : class, package, 상속관계
		//public : All
		
		//외부로부터 접근할 수 있는 권한을 정해준다
		//상수는 private가 필요 없다
		//값을 넣는 방법은 두가지(메소드 setter,생성자)
		//값을 빼는 방법은 한가지 밖에 없다(메소드 getter)
		
		Animal2 ani2 = new Animal2();
		ani2.setName("철철이");
		ani2.setAge(10);
		ani2.crying();
		
		//외부에서 값을 빼낼때
		String ani2Name = ani2.getName();
		System.out.println(ani2Name);
//		ani2.name = "ㅇㅇㅇㅇ";
//		ani2.age = 3;

	}

}
