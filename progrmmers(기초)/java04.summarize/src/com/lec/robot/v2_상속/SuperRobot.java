package com.lec.robot.v2_상속;

public class SuperRobot extends Robot{
	
	public SuperRobot(String name, int qty) {
		super(name, qty);
		// TODO Auto-generated constructor stub
	}
	public void actionFly(){System.out.println("날 수가 있습니다..");}
	public void actionMissile(){System.out.println("미사일을 쏠 수가 있습니다.");}
	public void actionSword(){System.out.println("검이 있습니다.");}
	
}
