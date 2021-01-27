package com.koreait.first.control;

import java.util.Scanner;

public class If4_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요  : ");
		int height = scan.nextInt();
		
		if("남".equals(gender)) {
			int avgHeight = 165;	//블락단위로 사용 가능(L22까지), 변경하기 쉽도록 먼저 선언해주기
			
			if(height > avgHeight) {
				System.out.println("당신은 평균 초과입니다.");	
			} else if(height < avgHeight) {
				System.out.println("당신은 평균 미만입니다.");
			} else {
				System.out.println("당신은 평균입니다.");
			}
			
		} else if ("여".equals(gender)) { 
			int avgHeight = 157;
			
			if(height > avgHeight) {
				System.out.println("당신은 평균 초과입니다.");	
			} else if(height < avgHeight) {
				System.out.println("당신은 평균 미만입니다.");
			} else {
				System.out.println("당신은 평균입니다.");
			}
		}
		
		scan.close();
	}

}