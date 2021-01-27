package com.koreait.first.loop;

public class While {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // 구구단 출력, 몇번돌려야할지 알때
			System.out.print(i + ",");
		}

		System.out.println();

		int i = 0;
		while (i < 5) { // 언제 멈춰야할지 알아야할때
			System.out.print(i + ",");
			i++;
		}

		System.out.println();

		int z = 0;
		while (true) { // while(ture)제일 베스트 사용방법,(true)무한루프
			if (z == 5) {
				break;
			}
			System.out.print(z + ",");
			z++;
		}

		int y = 0;
		for (; y < 10; y++) { // (;;)무한루프
			System.out.print(y);
		}

	}

}
