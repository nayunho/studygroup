package com.lec.robot.v7_생성자;

import com.lec.robot.v4_인터페이스.Inter.InterFly;
import com.lec.robot.v4_인터페이스.Inter.InterMissile;
import com.lec.robot.v4_인터페이스.Inter.InterSword;

public class SuperRobot extends Robot{

	public SuperRobot(InterFly fly, InterMissile missile, InterSword sword, String name, int qty) {
		super(fly,missile,sword,name,qty);
	}
}
