package com.koreait.first.inter;

public class InterTest {

	public static void main(String[] args) {
		//InterParent는 객체화 안되기 때문에 반대로는 안된다
		InterParent ip = new InterFatherClass();
		ip.print();
		InterParent ip2 = new InterParentClass();
		ip2.print();
	}

}
