package com.lec.robot.v4_인터페이스;

public abstract class Robot {
	
	public String name;
	public int qty;
	
	public Robot(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	public void shap() {System.out.println(this.name+"Robot입니다. 팔,다리,몸통이 있습니다.");};
	public void actionMalk() {System.out.println("걸을 수가 있습니다.!");};
	public void actionRun() {System.out.println("달릴 수가 있습니다.");};
	
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();
	
	
}
