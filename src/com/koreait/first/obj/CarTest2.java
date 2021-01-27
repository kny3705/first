package com.koreait.first.obj;

public class CarTest2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "페라리";
		car1.cc = 5000;
		car1.color = "붉은색";

		Car car2 = new Car();
		car2.name = car1.name;
		car2.cc = car1.cc;
		car2.color = car1.color;

		car1 = car2; // 여기서 같다고 하면 true

		car1.name = "쏘나타"; // 둘다 쏘나타로 변경됨 car2.name = "쏘나타";이렇게 써도 똑같음

		car1.drive();
		car2.drive();

		// 안에 내용은 같더라도 주소값이 다르기 때문에 false
		// == 비교는 주소값 비교기 때문에 무조건 false

		System.out.println(car1 == car2);
		
		//Car car1 - Stack (LIFO)
		//new Car() - Heap (FIFO)
	}

}
