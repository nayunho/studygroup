package com.lec.robot.v1_기본;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V1.0 (Basic) ===");
		System.out.println();
		
		CheapRobot cheapbot = new CheapRobot(10);
		
		cheapbot.shape();
		cheapbot.actionMalk();
		cheapbot.actionRun();
		cheapbot.actionMissile();
		cheapbot.actionSword();
		
		System.out.println("StandardRobot의 재고사항" + cheapbot.qty);
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot(10);
		
		standardRobot.shape();
		standardRobot.actionMalk();
		standardRobot.actionRun();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		
		System.out.println("StandardRobot의 재고사항" + standardRobot.qty);
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot(10);
		
		superRobot.shape();
		superRobot.actionMalk();
		superRobot.actionRun();
		superRobot.actionMissile();
		superRobot.actionSword();
		
		System.out.println("superRobot의 재고사항" + superRobot.qty);
		System.out.println();
		
	}
	
}
