package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.Inter.InterFly;
import com.lec.robot.v4_인터페이스.Inter.InterMissile;
import com.lec.robot.v4_인터페이스.Inter.InterSword;

public class StandardRobot extends Robot{
	
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	
	public void setFly(InterFly fly) {
		this.fly = fly;
	}


	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}


	public void setSword(InterSword sword) {
		this.sword = sword;
	}
	
	public StandardRobot(String name, int qty) {
		super(name, qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		fly.fly();
		
	}

	@Override
	public void actionMissile() {
		missile.missile();
		
	}

	@Override
	public void actionSword() {
		sword.sword();
		
	}
	
}
