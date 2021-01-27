package com.koreait.first.loop;

public class For7 {

	public static void main(String[] args) {
		int star = 6;
		
//		for(int i=0; i<star; i++) {			
//			for(int k=star-1; k>i; k--) {
//				System.out.print("_");
//			}		
//			for(int z=0; z<=i; z++) {
//				System.out.print("*");
//			}		
//			System.out.println();
//		}
//		
//		for(int i=0; i<star; i++) {
//			for(int j=star; j>0; j--) {
//				if(i<j-1) {
//					System.out.print("_");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=star; i++) {
			for(int z=0; z<star; z++) {
				if(star-i > z) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for(int i=star; i>0; i--) {	 		//star 값만큼 실행
			for(int z=1; z<=star; z++) {	//star 값만큼 실행
				if(i>z) {					//i가 z보다 클 경우 " "출력
					System.out.print(" ");
				} else {
					System.out.print("*");	//나머지 "*"출력
				}
			}
			System.out.println();			//줄바꿈
		}

	}

}