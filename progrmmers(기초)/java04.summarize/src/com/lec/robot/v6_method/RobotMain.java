package com.lec.robot.v6_method;

import com.lec.robot.v4_인터페이스.Inter.InterFly;
import com.lec.robot.v4_인터페이스.Inter.InterMissile;
import com.lec.robot.v4_인터페이스.Inter.InterSword;
import com.lec.robot.v4_인터페이스.impl.FlyNo;
import com.lec.robot.v4_인터페이스.impl.FlyYes;

import com.lec.robot.v4_인터페이스.impl.missileNo;
import com.lec.robot.v4_인터페이스.impl.missileYes;
import com.lec.robot.v4_인터페이스.impl.탄도미사일;

import com.lec.robot.v4_인터페이스.impl.swordNo;
import com.lec.robot.v4_인터페이스.impl.swordYes;
import com.lec.robot.v4_인터페이스.impl.swordwood;
import com.lec.robot.v4_인터페이스.impl.울트라짱검;


public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V6.0 (common method) ===");
		System.out.println();

		makeRobot(new CheapRobot("Cheap",10),new FlyNo(),new missileNo(),new swordNo());
		makeRobot(new StandardRobot("Standard",7),new FlyYes(),new missileYes(),new swordwood());
		makeRobot(new SuperRobot("Super",5),new FlyYes(),new 탄도미사일(),new 울트라짱검());
		
	}

	private static void makeRobot(Robot robot,InterFly fly,InterMissile missile,InterSword sword) {
		robot.actionRun();
		robot.actionMalk();
		robot.setFly(fly);
		robot.actionFly();
		robot.setMissile(missile);
		robot.actionMissile();
		robot.setSword(sword);
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고량="+robot.qty);
		System.out.println();
	}
	
}
