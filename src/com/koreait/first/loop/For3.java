package com.koreait.first.loop;

public class For3 {

	public static void main(String[] args) {
		for(int i=1; i<24; i++) {
			
			for(int z=0; z<=59; z++) {	//z가 다 끝난후 다시 i로
				
				System.out.printf("%d : %d \n", i, z);
			}
			System.out.println("땡!");
		}

	}

}
