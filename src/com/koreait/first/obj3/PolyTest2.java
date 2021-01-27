package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B", 10);	//ClassB타입의 cb에 ClassB주소값을 복사
		ClassA ca = cb;		//할 수 있음, 부모타입은 자식의 주소값을 가리킬 수 있다.
							//내가 아는것을 자식들도 알고있음 그렇기 때문에 가리킬 수 있다
		Object obj = ca;	//결국 같은 주소값 cb = ca =obj 이지만 타입이 다르다
		ca.print();			//실행은 객체기준이기 때문에 ClassA에 있는 메소드가 호출되는것이 아니라
							//ClassB에 있는 메소드가 호출된다
		//타입으로는 메소드를 호출할 수 있냐없냐만 정해주는것
		//실제로 실행되는것은 new로 인해 주소값을 가지게된 객체(인스턴스)를 가리킨다
		
		String str;
		str = new String("dd"); //String("dd) 객체의 주소값이 복사되어 str변수에 들어갔다
		
//		ClassC cc = (ClassC)cb;	에러발생
//		cc.print();
		//자식타입은 부모타입에 없는 것이 있을수 있기때문에 가리킬 수 없다
		//부모타입은 자신이 가지고 있는것을 자식타입이 가지고 있기 때문에 가리킬 수 있다.
		//ClassB타입인 cb에는 ClassC타입으로 형변환할 수 없다
		//ClassC 타입에는 다른 메소드(예시로dd())가 생길 여력이 있는데 생긴다면 
		//ClassB 타입인 cb에는 dd()가 없기때문에 cc.dd()를 사용할수 없음
		//부모타입으로 갈수록 메소드가 줄어든다
		//ClassA 타입일때는 ClassB에 있는 drive 메소드를 모름
		//타입에 따라서 그 메소드를 호출할 수도 있고 없을 수도 있음
		//타입이 가지고 있는(상속받은것과 아는만큼만) 호출 가능하다.
	}

}
