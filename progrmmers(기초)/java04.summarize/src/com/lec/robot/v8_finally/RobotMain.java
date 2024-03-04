package com.lec.robot.v8_finally;

import com.lec.robot.v4_인터페이스.impl.FlyNo;
import com.lec.robot.v4_인터페이스.impl.FlyYes;
import com.lec.robot.v4_인터페이스.impl.missileNo;
import com.lec.robot.v4_인터페이스.impl.missileYes;
import com.lec.robot.v4_인터페이스.impl.swordYes;
import com.lec.robot.v4_인터페이스.impl.swordwood;
import com.lec.robot.v4_인터페이스.impl.울트라짱검;
import com.lec.robot.v4_인터페이스.impl.탄도미사일;
import com.lec.robot.v7_생성자.CheapRobot;
import com.lec.robot.v7_생성자.Robot;
import com.lec.robot.v7_생성자.StandardRobot;
import com.lec.robot.v7_생성자.SuperRobot;

public class RobotMain {
	
	public static void main(String[] args) {
		
		System.out.println("=== Robot V8.0 (finally) ===");
		System.out.println();
		
		Robot robot =null;
		
		robot=new CheapRobot(new FlyYes(), new missileYes(),new swordwood(), "Cheap", 10);
		robot.productRobot();
		
		robot=new StandardRobot(new FlyNo(), new missileNo(), new swordYes(), "Standard", 7);
		robot.productRobot();
		robot=new SuperRobot(new FlyYes(), new 탄도미사일(), new 울트라짱검(), "Super", 5);
		robot.productRobot();
		
		
		//실습
		//1.버전4에서 setter없애는 법
		//2.버전8에서 method다형성(productRobot(interFly,InterMissile,InterSword))
	}

}
