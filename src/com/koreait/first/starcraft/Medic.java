package com.koreait.first.starcraft;

public class Medic extends Unit implements Healedable {
	
	public Medic() {
		super(25);
	}
	
	public void heal(Unit unit) {
		if(!(unit instanceof Healedable)) {	//true, false 조건 확인
			System.out.println("치료할 수 없습니다.");
			return;
		}
		while(unit.MAX_HP > unit.hp) {
			unit.hp += 1;
		}
	}
}
