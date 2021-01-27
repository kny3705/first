package com.koreait.first.obj2;

public class InheriTest3 {

	public static void main(String[] args) {
		ClassC cA = new ClassD("김남길", 20);
		cA.print();
//		cA.ddd();
		
		ClassD cD = (ClassD)cA;
		cD.ddd();
		
		//ClassA cA = new ClassB();	부모타입은 자식객체의 주소값을 가질수 있다
		//ClassB cB = new ClassA();	자식타입은 부모객체의 주소값을 가질수 없다
	}

}