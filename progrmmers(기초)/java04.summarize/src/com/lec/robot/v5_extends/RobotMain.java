package com.lec.robot.v5_extends;

import com.lec.robot.v4_인터페이스.impl.FlyNo;
import com.lec.robot.v4_인터페이스.impl.missileNo;
import com.lec.robot.v4_인터페이스.impl.swordYes;
import com.lec.robot.v4_인터페이스.impl.울트라짱검;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V5.0 (extends) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap", 10);
		System.out.println(robot.getClass());
		
		robot.actionRun();
		robot.actionMalk();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new missileNo());
		robot.actionMissile();
		robot.setSword(new swordYes());
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고량="+robot.qty);
		System.out.println();
		
		robot = new StandardRobot("Standard", 5);
		System.out.println(robot.getClass());
		
		robot.actionRun();
		robot.actionMalk();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new missileNo());
		robot.actionMissile();
		robot.setSword(new swordYes());
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고량="+robot.qty);
		System.out.println();

		robot = new SuperRobot("Super", 7);
		System.out.println(robot.getClass());
		
		robot.actionRun();
		robot.actionMalk();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new missileNo());
		robot.actionMissile();
		robot.setSword(new 울트라짱검());
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고량="+robot.qty);
		System.out.println();
		
		
	}
	
}
