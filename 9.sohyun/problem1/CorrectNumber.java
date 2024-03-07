package test4;

import java.util.Scanner;

public class CorrectNumber {

	//숫자 맞추기 게임 (1-6의 숫자(정수)를 랜덤으로 한번 뽑은 다음 숫자를 입력받아서 맞추는 게임을 한다. 맞출때 까지 입력하게 하는 코드를 작성하시오 )
		
	//1) "1이상 6이하의 정수를 입력하세오"를 프린트하고 숫자를 입력받는다. 
	//2) 정답을 맞출시에는 "정답입니다"를 프린트하고 루프탈출 / 정답이 아닐시에는 " 1이상 6이하의 정수를 다시 입력하세요"를 출력하고 숫자를 다시 입력받게 한다. 
	//(힌트 : 랜덤으로 뽑는 숫자는 루프문 밖에서 뽑아서 사용한다. Math 클라스의 random()메소드 이용 ) 
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int reuslt= (int) ((Math.random()*6)+1);
		System.out.println("주사위 맞추기 게임");
		System.out.println("주사위를 던집니다. ");
		while(true) {
			System.out.println("1이상 6 이하의 정수를 입력하세요\n =>");
			int cnt=sc.nextInt();
			if(reuslt==cnt) {
				System.out.println("정답입니다");
				break;
			}else {
				System.out.println("1이상 6이하의 정수를 다시 입력하세요");
			}
		}
	}
}
