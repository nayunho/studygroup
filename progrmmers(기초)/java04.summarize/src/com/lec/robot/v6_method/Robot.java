package com.lec.robot.v6_method;

import com.lec.robot.v4_인터페이스.Inter.InterFly;
import com.lec.robot.v4_인터페이스.Inter.InterMissile;
import com.lec.robot.v4_인터페이스.Inter.InterSword;

public class Robot {
	InterFly fly;
	InterMissile missile;
	InterSword sword;
	 
	public String name;
	public int qty;
		
	public Robot(String name, int qty) {
			this.name = name;
			this.qty = qty;
	}
	
	public void shap() {System.out.println(this.name+"Robot입니다. 팔,다리,몸통이 있습니다.");};
	public void actionMalk() {System.out.println("걸을 수가 있습니다.!");};
	public void actionRun() {System.out.println("달릴 수가 있습니다.");};
	
	public void setFly(InterFly fly) {
		this.fly = fly;
	}


	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}


	public void setSword(InterSword sword) {
		this.sword = sword;
	}
	
	public void actionFly() {
		fly.fly();
	}

	public void actionMissile() {
		missile.missile();
	}

	public void actionSword() {
		sword.sword();
	}
}
