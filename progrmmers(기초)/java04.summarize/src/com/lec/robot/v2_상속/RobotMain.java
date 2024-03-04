package com.lec.robot.v2_상속;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V2.0 (상속) ===");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("Cheap", 10);
		cheapRobot.shape();
		cheapRobot.actionMalk();
		cheapRobot.actionRun();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name+"의 재고사항" + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standard = new StandardRobot("standard", 10);
		standard.shape();
		standard.actionMalk();
		standard.actionRun();
		standard.actionMissile();
		standard.actionSword();
		System.out.println(standard.name+"의 재고사항" + standard.qty);
		System.out.println();
		
		SuperRobot superr = new SuperRobot("super", 10);
		superr.shape();
		superr.actionMalk();
		superr.actionRun();
		superr.actionMissile();
		superr.actionSword();
		System.out.println(superr.name+"의 재고사항" + superr.qty);
		System.out.println();
	}
	
}
