package com.koreait.first;

public class Mod {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;

		System.out.println(n1 / n2); // 몫
		System.out.println(n1 % n2); // 나머지값 mod

		int n3 = 8;
		int n4 = 7;
		int n5 = 6;
		int n6 = 5;

		System.out.println(n3 % 2); // 홀짝구분할때
		System.out.println(n4 % 2);
		System.out.println(n5 % 2);
		System.out.println(n6 % 2);

		// 사이 1~30 짝수값만 출력해주세요

		for (int i = 2; i <= 30; i += 2) { // 2부터 시작 i += 2(짝수값 구하기)
			System.out.print(i);

			if (i < 30) {
				System.out.print(", ");
			}
		}

		System.out.println();

		for (int i = 2; i <= 30; i++) {
			System.out.print(i % 2 == 0 ? i : ", ");
		}

		System.out.println();

		for (int i = 1; i <= 30; i++) {
			if (i == 1) {
				continue; //continue;는 스킵해서 바로 위 식으로(for문) 실행
			} else {
				System.out.print(i % 2 == 0 ? i : ", ");
			}
		}
	}

}
