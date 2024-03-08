package test5;

import java.util.Scanner;

public class CorrectNumber {

	//숫자 맞추기 게임 (1-6의 숫자(정수)를 랜덤으로 한번 뽑은 다음 숫자를 입력받아서 맞추는 게임을 한다. 맞출때 까지 입력하게 하는 코드를 작성하시오 )
	
	//1. 이기고 지고 비긴 상태를 win, lose, draw 클래스를 만들어 승부 출력
	//2. 묵,찌,빠 배열과 Math 함수를 매치해 값을 얻어 이기고 지고의 승부 출력
	//3. 괜히 머리쓰기 귀찮으니 if문 or for문 노가다로 쉽게 풀기   <- 가장 쉬운듯
	
	public static void main(String[] args) {

		System.out.println("찌 바위 보!");
		System.out.print("나 -> ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		int s = (int)(Math.random()*3);
		String[] z = {"묵","찌","빠"};
		System.out.println("상대 -> "+ z[s]);
		draw draw = new draw(a,z[s]);
		lose lose = new lose(a,z[s]);
		win win = new win(a,z[s]);
		
		draw.result();
		lose.result();
		win.result();

	}
	
}
