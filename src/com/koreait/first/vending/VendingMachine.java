package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachine {
	private Scanner scan;
	private Can[] canArr; // can 객체 배열 만들기, 대문자로 시작하는것들은 디폴트 값이 null
	private int sum;

	public VendingMachine() {
		init();
	}

	private void init() { // private를 사용하였기 때문에 내부용 외부에서 호출할 수 없다
		String[] nmArr = { "콜라", "사이다", "환타", "솔의눈", "데자와" };
		int[] priceArr = { 500, 600, 700, 800, 900 };

		scan = new Scanner(System.in);

		canArr = new Can[nmArr.length];

		for (int i = 0; i < canArr.length; i++) {
			// 구조는 같은 객체지만 다 다른 주소값을 가진다
			canArr[i] = new Can(nmArr[i], priceArr[i]);
		}
	}

	public void showMenus() {
		System.out.println("--메뉴--");
		for (int i = 0; i < canArr.length; i++) {
			System.out.printf("%d. %s - %d원\n", i + 1, canArr[i].getNm(), canArr[i].getPrice());
		}
	}

	public void purchase() {
		while (true) {
			System.out.print("메뉴선택 (0:종료) > ");
			int choiceNo = scan.nextInt();
			if (choiceNo == 0) {
				break;
			} else if (choiceNo < 0 || choiceNo > canArr.length) {
				System.out.println("잘 못 입력하셨습니다.");
				continue;
			}
			sum += canArr[choiceNo - 1].getPrice();
			
			//Can can = canArr[choiceNo - 1];
			//sum += can.getPrice();
		}
	}

	public void showSum() {
		System.out.printf("총 구매금액 : %,d원\n", sum);
	}
}
