package test;

/*
	다음 인터페이스를 구현하여 원,사각형의 넓이 및 둘레를 구하시오
	Shape인터페이스를 Circle클래스와 Rectangle클래스에서 구현하고
	각 클래스에서 필요한 메서드를 추가적으로 구현
	변수 선언은 private
	넓이와 둘레의 값은 소수점 두번쨰자리까지만 출력
	출력할떄는 System.out.printf();
  -----------------------
  	출력 예시) 
  	
  	원의 넓이는 78.54입니다.
  	원의 둘레는 31.42입니다.
  	사각형의 넓이는 84.70입니다.
  	사각형의 둘레는 41.80입니다.
  	-----------------------
  	=>둘레나 넓이는 예시와 같을 필요는 없음
*/
public class Main {
    public static void main(String[] args) {

    	Circle circle = new Circle(5.0);
    	System.out.printf("원의 넓이는 %.2f입니다.\n",circle.area());
    	System.out.printf("원의 둘레는 %.2f입니다.\n",circle.perimeter());
    	Rectangle rectangle = new Rectangle(15.4, 5.5);
    	System.out.printf("사각형의 넓이는 %.2f입니다.\n",rectangle.area());
    	System.out.printf("사각형의 둘레는 %.2f입니다.\n",rectangle.perimeter());

    }
}
