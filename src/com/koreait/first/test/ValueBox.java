package com.koreait.first.test;

public class ValueBox {
	private int value;
	
	public ValueBox() {}
	
	public ValueBox(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		ValueBox vb = (ValueBox)obj;	//obj는 getValue()를 모른다, 형변환을 해줘야 함
		return this.value == vb.value;	//vb.getValue();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
