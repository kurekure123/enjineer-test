package com.engineer.sequence;

public class SequenceServiceImpl implements SequenceService{
	// body 가 없어서 추상인 상태를 implements 를 사용해서 가상으로 매칭시켜줌
	@Override
	public void setInitNum(int initNum) {
	}

	@Override
	public int getInitNum() {
		return 0;
	}

	@Override
	public void setLimitNum(int limitNum) {
		
	}

	@Override
	public int getLimitNum() {
		return 0;
	}


	@Override
	public String calcArithmetic(SequenceBean bean) {
		String result = "", opcode = "";
		int sum = 0;
		for(int i = bean.getInitNum(); i <= bean.getLimitNum(); i++) {
    		if(i != bean.getLimitNum()) {
    			opcode += i + "+";	
    		}else {
    			opcode += i + "=";
    		}
    		sum += i;
    		result = opcode + sum;
    		break;
		}
		return result;
	}

	@Override
	public SequenceBean[] list() {
		return null;
	}

	@Override
	public String calcSwitch(SequenceBean bean) {
		String result2 = "";
		switch(bean.getOpcode()) {
		case "+" :
		case "-" :
		case "*" :
		case "/" :
		case "%" : 
		}
		return null;
	}

	@Override
	public void setOpcode(String opcode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getOpcode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcGeometirc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcDifference() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calsFactorial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calsFibonacci() {
		// TODO Auto-generated method stub
		return null;
	}
}
