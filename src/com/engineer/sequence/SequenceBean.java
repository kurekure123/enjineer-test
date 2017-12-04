package com.engineer.sequence;

//하단은 클래스 헤더
public class SequenceBean {
	// 하단은 멤버 변수, 멤버 변수의 값은 property 라고 함
	private int initNum, limitNum, sum; 
	private String opcode;
	
	// 하단은 멤버 메소드
	public void setInitNum(int initNum) {
		this.initNum = initNum;
	}
	public int getInitNum() {
		return initNum; 
	}
	
	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}
	public int getLimitNum() {
		return limitNum;
	}
	
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}
	public String getOpcode() {
		return opcode; 
	}
}
/* 파란색은 멤버변수, 갈색은 지역변수 .
 * */
