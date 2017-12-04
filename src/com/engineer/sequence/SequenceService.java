package com.engineer.sequence;

public interface SequenceService {
	public String calcArithmetic(SequenceBean bean);
	/*  bean 는 인스턴스 이름을 정해줘야해서
	 * */
	public String calcSwitch(SequenceBean bean);
	/* 
	   	등차 수열 : arithmetic
	   	1 + 2 + 3 + 4 + .... + 100 = 5050
	 * */
	/* 
	 스위치 수열 : switch
	 1 - 2 + 3 - 4 ... - 100 = -50
	 * */
	public String calcGeometirc();
	/*
	 등비 수열 : Geometric
	 * */
	
	public String calcDifference();
	/*
	 계차 수열 : Difference.
	 1 + 2 + 4 + 7 + 11 + 16 + 22 + .... 100
 	 * */
	public String calsFactorial();
	/*
	 팩토리얼 수열 : factorial
	 1! + 2! + 3! + ..+ 10! 
	 * */

	public String calsFibonacci();
	/*
	 피보나치 수열 : Fibonacci
	 1 + 1 + 2 + 3 + 5 + 8 + 13...
	 * */
	
	public void setInitNum(int initNum);
	public int getInitNum();
	public void setLimitNum(int limitNum);
	public int getLimitNum();
	public SequenceBean[] list(/*파라 미터*/);
	public void setOpcode(String opcode);
	public String getOpcode();
}
