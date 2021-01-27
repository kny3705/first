package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani_1 = new Animal();	//()기본생성자, 객체화를 하면 생성자를 만든다
		ani_1.crying();
		
		Animal ani_2 = new Animal("나비", 3);
		
		Animal ani_3 = new Animal("달미");
		ani_3.crying();
		
		Animal ani_4 = new Animal(4);
		ani_4.crying();

	}

}
