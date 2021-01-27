package com.koreait.first.method;

public class MethodGugudan {

	public static void main(String[] args) {
		gugudan(5, 8);

	}
	
	public static void gugudan(int sNum, int eNum) {
		for(int i=sNum; i<=eNum; i++) {
			gugudan(i);
			System.out.println("------------");
		}
	}
	
//	public static void gugudan(int n1, int n2) {
//		for(int i=n1; i<=n2; i++) {
//			for(int j=1; j<=9; j++) {
//			System.out.printf("%d * %d = %d\n", i, j, i*j);
//			}
//		}
//	}
	
	public static void gugudan(int n) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}
}
