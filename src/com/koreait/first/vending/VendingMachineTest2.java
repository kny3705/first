package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest2 {

	public static void main(String[] args) {
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈", "데자와"};
		int[] priceArr = {500, 600 ,700, 800, 900};
		
		System.out.println("--메뉴--");
		for(int i = 0; i<nmArr.length; i++) {
			System.out.printf("%d. %s - %s원\n", i+1, nmArr[i], priceArr[i]);
		}
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("메뉴선택 (0:종료) > ");
		
		int result = 0;
		
		while(true) {
			System.out.print("메뉴선택 (0:종료) > ");
			int drink = scan.nextInt();
			if(drink == 0) {
				break;			
			}
			result += priceArr[drink-1];
		}
		
		System.out.printf("총 구매급액  : %s원\n",result);
		scan.close();
		
	}

}
