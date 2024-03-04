package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V4.0 (인터페이스) ===");
		System.out.println();
		
		CheapRobot cheaprobot = new CheapRobot("Cheap", 10);
		cheaprobot.actionRun();
		cheaprobot.actionMalk();
		cheaprobot.setFly(new FlyNo());
		cheaprobot.actionFly();
		cheaprobot.setMissile(new missileNo());
		cheaprobot.actionMissile();
		cheaprobot.setSword(new swordYes());
		cheaprobot.actionSword();
		System.out.println(cheaprobot.name + "Robot의 재고량="+cheaprobot.qty);
		System.out.println();
		
		StandardRobot standardprobot = new StandardRobot("standard", 10);
		standardprobot.actionRun();
		standardprobot.actionMalk();
		standardprobot.setFly(new FlyNo());
		standardprobot.actionFly();
		standardprobot.setMissile(new missileNo());
		standardprobot.actionMissile();
		standardprobot.setSword(new swordYes());
		standardprobot.actionSword();
		System.out.println(standardprobot.name + "Robot의 재고량="+standardprobot.qty);
		System.out.println();
		
		SuperRobot superrobot = new SuperRobot("super", 10);
		superrobot.actionRun();
		superrobot.actionMalk();
		superrobot.setFly(new FlyNo());
		superrobot.actionFly();
		superrobot.setMissile(new missileNo());
		superrobot.actionMissile();
		superrobot.setSword(new 울트라짱검());
		superrobot.actionSword();
		System.out.println(superrobot.name + "Robot의 재고량="+superrobot.qty);
		System.out.println();
	}
	
}
