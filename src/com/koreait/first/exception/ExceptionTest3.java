package com.koreait.first.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {	//throws Exception을 써줬다면 try catch를 써줘야 한다
			div(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("수학적인 에러가 발생하경ㅆ습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (Exception e) {	//무조건 혼자 있거나 제일 밑에 써줘야 한다.
			e.printStackTrace();
		}
		System.out.println("안녕");
	}
												
	public static void div(int n1, int n2) throws ArithmeticException, ClassNotFoundException {	//throws Exception 에러발생 가능하다는 표시
		System.out.println(n1 / n2);
	}

}
