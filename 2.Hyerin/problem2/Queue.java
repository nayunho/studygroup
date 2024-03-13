package problem;

/*
자료구조 공부!!
자료 구조 중 큐는 자료 구조의 한 형태로 자료의 입력과 출력이 한 방향으로만 이루어지는 선형 자료형으로 선입선출 방식으로
자료의 입출력을 관리 합니다. 즉, 먼저 들어온 자료가 먼저 나가는 방식 입니다. 

https://wooono.tistory.com/395 <-- 사이트에 큐 작동 방식 참고!!

ArrayList를 사용해서 큐 작동 방식을 구현해 주세요!!
메인 메소드 부분은 건들 필요 없이 메서드 2개만 만들어 주세면 됩니다!
클래스명은 Queue로 해주세요!
*/
import java.util.*;

public class Queue {

//여기에 전역변수로 리스트 선언
	List list = new ArrayList();
	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println("큐에 원소 추가");
		System.out.println("--------------");
		q.push(0);
		q.push(1);
		q.push(2);
		
		System.out.println("큐에서 원소 제거");
		System.out.println("--------------");
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println();
		
		System.out.println("큐에서 원소 제거");
		System.out.println("--------------");
}
	
	//큐에 요소를 넣는 메서드 - 메서드 명은 push, 타입은 void 메서드 로 만들어 주세요!!
	public void push(int i) {
		list.add(i);
		System.out.println(i);
	}
	
	//큐에서 요소 빼기 - 메서드명은 pop, 메서드 타입은 Integer로 만들어 주세요!!
	public Integer pop() {
		int cnt = list.size();
		
		if(cnt==0) {
			System.out.println("큐는 비어있습니다!");
		}else {
			return (Integer) list.remove(0);
		}
		return 0;
	}

}