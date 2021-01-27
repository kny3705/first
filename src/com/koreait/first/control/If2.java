package com.koreait.first.control;

public class If2 {
	public static void main(String[] args) {
		int num = 9;
		
		//num 값이 10이상이면 "num은 10이상입니다."가 나타나도록 해주세요.
		//10 미만이면 "num은 10미만입니다."
		
		//if문이 그룹일때 else가 있으면 무조건 하나만 실행
		if(num >= 10) {
			System.out.println("num은 10이상입니다.");
		} else {
			System.out.println("num은 10미만입니다.");
		}

	}

}
