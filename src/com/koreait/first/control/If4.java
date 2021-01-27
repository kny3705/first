package com.koreait.first.control;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요  : ");
		int height = scan.nextInt();
		
		if("남".equals(gender)) {	//gender.equals("남")이렇게 쓸 경우 gender가 null일 경우 에러발생
			if(height > 165) {
				System.out.println("당신은 평균 초과입니다.");	
			} else if(height < 165) {
				System.out.println("당신은 평균 미만입니다.");
			} else {
				System.out.println("당신은 평균 입니다.");
			}
		} else if ("여".equals(gender)) { 
			
			if(height > 157) {
				System.out.println("당신은 평균 초과입니다.");	
			} else if(height < 157) {
				System.out.println("당신은 평균 미만입니다.");
			} else {
				System.out.println("당신은 평균 입니다.");
			}
		}
		
		scan.close();	//안써도 크게 상관없음
	}

}
