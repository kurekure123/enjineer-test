package com.engineer.sequence;

import java.util.Scanner;

public class SequenceController {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	SequenceBean bean = null;
    	SequenceService service = new SequenceServiceImpl();
    	/*SequenceService = data type(reference) service = instance , new = opcode, 
    	 * SequenceServiceImpl = constructor ()는 파라미터 존 
    	 * 타입 선언은 roop 구조 밖에서 선언하자
    	 * */
    	while(true) {
    		System.out.println("0. 종료, 1. 연산수 입력, 2. 스위치 수열");
    		
    		switch(s.nextInt()) {
    		case 0 :
    			System.out.println("시스템 종료");
    			return;
    		case 1 : 
    			bean = new SequenceBean();
    			System.out.println("시작값 입력");
    			bean.setInitNum(s.nextInt());
    			System.out.println("리밋값 입력");
    			bean.setLimitNum(s.nextInt());
    			System.out.println(service.calcArithmetic(bean));
    			/*String result = service.calc(bean);
    			 자바 가비지 콜렉터에 의해 이미 연산이 끝난 result 값은 제거 되기 때문에, 
    			 * 새로 String  
    			 * 받아주는 녀석이 필요함
    			* System.out.println(result);
    			* */
    		case 2 : 
    			bean = new SequenceBean();
    			System.out.println("첫번째 숫자를 입력해주세요");
    			bean.setInitNum(s.nextInt());
    			System.out.println("연산자를 입력해주세요");
    			bean.setOpcode(s.next());
    			System.out.println("두번째 숫자를 입력해주세요");
    			bean.setLimitNum(s.nextInt());
    			System.out.println(service.calcSwitch(bean));
    			break;
    		}
    	}
    }
}
