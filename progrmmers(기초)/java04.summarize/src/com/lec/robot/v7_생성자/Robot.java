package com.lec.robot.v7_생성자;

import com.lec.robot.v4_인터페이스.Inter.InterFly;
import com.lec.robot.v4_인터페이스.Inter.InterMissile;
import com.lec.robot.v4_인터페이스.Inter.InterSword;

public class Robot {
	
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	public String name;
	public int qty;
	
	public Robot() {
	}
	
	public Robot(InterFly fly, InterMissile missile, InterSword sword, String name, int qty) {
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
		this.name = name;
		this.qty = qty;
	}
	
	// 공통 메서드
	public void shap() {System.out.println(this.name+"Robot입니다. 팔,다리,몸통이 있습니다.");};
	public void actionMalk() {System.out.println("걸을 수가 있습니다.!");};
	public void actionRun() {System.out.println("달릴 수가 있습니다.");};
	
	//개별 기능
	public void actionFly() {
		fly.fly();
	}

	public void actionMissile() {
		missile.missile();
	}

	public void actionSword() {
		sword.sword();
	}

	//생산과정
	public void productRobot() {
		System.out.println(this.getClass());
		shap();
		actionRun();
		actionMalk();
		actionFly();
		actionMissile();
		actionSword();
		System.out.println(this.toString());
	}
	
	public String toString() {
		return this.name+ "의 재고수량 = " + this.qty;
	}	
}
