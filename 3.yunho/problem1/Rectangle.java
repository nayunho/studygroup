package test;

public class Rectangle implements Shape {
	
	// 접근 제어자 private를 활용한 변수선언
	private double heigth;
	private double width;
	
	//생성자
	public Rectangle(double heigth,double width) {
		this.heigth=heigth;
		this.width=width;
	}
	
	//인터페이스 구현
	@Override
	public double area() {
		return width*heigth;
	}
	
	//일반메서드
	public double perimeter() {
		return heigth*2+width*2;
	}
}

