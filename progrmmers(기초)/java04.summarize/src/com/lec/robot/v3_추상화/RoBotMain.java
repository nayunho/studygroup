package com.lec.robot.v3_추상화;

import com.lec.robot.v2_상속.StandardRobot;
import com.lec.robot.v2_상속.SuperRobot;

public class RoBotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V3.0 (추상화) ===");
		System.out.println();
		
		CheapRobot cheaprobot = new CheapRobot("Cheap", 10);
		cheaprobot.shape();
		cheaprobot.actionMalk();
		cheaprobot.actionRun();
		cheaprobot.actionFly();
		cheaprobot.actionSword();
		cheaprobot.actionSword();
		System.out.println(cheaprobot.name+"의 재고사항" + cheaprobot.qty);
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
