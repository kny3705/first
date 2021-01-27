package com.koreait.first.control;

public class Switch {	//문자열 비교할 때 가장좋음

	public static void main(String[] args) {		
		int num = 4;
		
		switch(num) {
			case 1:
				System.out.println("1입니다.");
				break;	//break가 없다면 break를 만나기전까지 계속 실행
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			case 4:
				System.out.println("4입니다.");
				break;
			default:	//default의 위치는 상관없음
				System.out.println("1~4가 아닙니다.");
		}

		System.out.println("-----------------------");
		
		//문자열 비교일때 switch가 좋음
		String season = "가을";
		
		switch(season) {
			case "봄":
				System.out.println("꽃이 피었습니다.");
				break;
			case "여름":
				System.out.println("물놀이 가요~~");
				break;
			case "가을":
				System.out.println("단풍구경 갑시다.");
				break;
			case "겨울":
				System.out.println("눈싸움 해요~~");
				break;
			default:
			
		}
	}

}
