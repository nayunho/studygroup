package com.lec.robot.v7_생성자;

import com.lec.robot.v4_인터페이스.impl.FlyNo;
import com.lec.robot.v4_인터페이스.impl.FlyYes;
import com.lec.robot.v4_인터페이스.impl.missileNo;
import com.lec.robot.v4_인터페이스.impl.missileYes;
import com.lec.robot.v4_인터페이스.impl.swordYes;
import com.lec.robot.v4_인터페이스.impl.swordwood;
import com.lec.robot.v4_인터페이스.impl.울트라짱검;
import com.lec.robot.v4_인터페이스.impl.탄도미사일;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V7.0 (생성자) ===");
		System.out.println();
		
		Robot robot =null;
		
		robot=new CheapRobot(new FlyYes(), new missileYes(),new swordwood(), "Cheap", 10);
		robot.productRobot();
		
		robot=new StandardRobot(new FlyNo(), new missileNo(), new swordYes(), "Standard", 7);
		robot.productRobot();
		robot=new SuperRobot(new FlyYes(), new 탄도미사일(), new 울트라짱검(), "Super", 5);
		robot.productRobot();
		
		

		
		
	}

	
	
}
