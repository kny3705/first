package com.koreait.first.obj;

public class StaticTest2 {

	public static void main(String[] args) {
		//n1 = 22, n2 = 55;
		//인스턴스 객체를 활용하여 계산
		InstCalc calc1 = new InstCalc();
		calc1.n1 = 22;
		calc1.n2 = 55;
		
		System.out.println("calc1.sum : " + calc1.sum());
		
		//static 메소드를 활용하여 계산
		//static이 붙으면 객체화를 따로 안해도 됨(클래스로 직접 접근가능)
		//System.out.println("sum : " + StatCalc.sum(22, 55));
		
		StatCalc sc = new StatCalc();
		System.out.println("sum : " + sc.sum(22, 55));
		// ㄴ static 없을때
		
	}

}

class StatCalc {
	int sum(int n1, int n2) {
		return n1 + n2;
	}
}

class InstCalc {
	int n1;
	int n2;
	
	int sum() {
		return n1 + n2;
	}
}
