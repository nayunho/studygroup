package test;

public class Circle implements Shape {

	// 접근 제어자 private를 활용한 변수선언
	private double radius;
	
	//생성자
	public Circle(double radius) {
		this.radius=radius;
	}
	
	//인터페이스 구현
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
	//일반메서드
	public double perimeter() {
		return 2*Math.PI*radius;
	}
}

