package com.koreait.first.vending;

import java.util.Scanner;

//혼자해본것

public class VendingMachineTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num1 = 500;
		int num2 = 600;
		int num3 = 700;
		int num4 = 800;
		
		int result = 0;
		System.out.println("--메뉴--");
		System.out.print("메뉴선택 (0:종료) > ");
		int drink = scan.nextInt();

		if(drink == 1) {
			
		} else if(drink == 2) {
			
		} else if(drink == 3)
		while(drink != 0) {
			result += drink;
			
			System.out.print("메뉴선택 (0:종료) > ");
			drink = scan.nextInt();
		}
		
		System.out.println("총 구매급액  : " + result +"원");
		scan.close();
	}

}
