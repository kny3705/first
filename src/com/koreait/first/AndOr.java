package com.koreait.first;

public class AndOr {

	public static void main(String[] args) {
		boolean r1 = true && true && true;		//false가 날 가능성이 높은식을 앞쪽에 배치하는게 유리함!!
		System.out.println("r1 : " + r1);
		
		boolean r2 = true && true && false;		//And연산자는 하나라도 false가 들어있으면 무조건 false
		System.out.println("r2 : " + r2);
		
		boolean r3 = true || false || false;	//Or연산자는 하나라도 true가 들어있으면 무조건 true	
		System.out.println("r3 : " + r3);
		
		boolean r4 = false || false || false;	//true가 날 가능성이 높은식을 앞쪽에 배치하는게 유리함!!
		System.out.println("r4 : " + r4);

	}

}
