package com.koreait.first.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		
		try {								//일단 시도
			System.out.println(n1 / n2);
			System.out.println("에러 안났음!!");
		} catch (Exception e) {				//에러가 났을때 아래 실행
			e.printStackTrace();			//에러 메세지 보여준다
			System.out.println("에러 발생!!");
		} finally {							//예외가 생기든 안생기든 무조건 실행
			System.out.println("Finally");
		}
		System.out.println("안녕하세요!!");		//에러가 발생할 경우 catch를 안써주면 실행 안함
	}

}
