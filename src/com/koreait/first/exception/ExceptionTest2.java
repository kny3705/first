package com.koreait.first.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		div(10, 0);

	}
	
	public static int div(int n1, int n2) {
		try {						//try, catch는 필수 finally는 옵션
			return n1 / n2;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("완료!");	//무조건 실행
		}
		System.out.println("-- 종료 --");	//에러가 나면 실행, 에러가 안나면 실행 안함
		return 0;
	}

}
