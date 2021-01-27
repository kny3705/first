package com.koreait.first.control;

import java.util.Scanner;

public class If4_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요  : ");
		int height = scan.nextInt();
		
		int avgHeight = 0; //int avgHeight; else가 없으면 100% 실행이 안되므로 강아지를 쳤다면 초기화가 안된 상태이므로 에러발생
		
		if("남".equals(gender) || "남자".equals(gender) || "man".equals(gender)) { 
		//위 식에서 순서는 왼쪽에서 오른쪽으로 실행, "남자".equals(gender)가 더 좋은 식 gender.equals("남")을 썼을때 gender가 null일 경우 에러발생
			avgHeight = 165;
			
		} else if ("여".equals(gender) || "여자".equals(gender) || "woman".equals(gender)) { 
			avgHeight = 157;
			
		}
		
		if(height > avgHeight) {
			System.out.println("당신은 평균 초과입니다.!!!");
			
		} else if(height < avgHeight) {
			System.out.println("당신은 평균 미만입니다.");
			
		} else {
			System.out.println("당신은 평균입니다.");
			
		}
		
		scan.close();
	}

}