package test4;

import java.util.*;
public class PerSonmain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<Person>();
		Person person=new Person();
		while(true) {
			System.out.println("1>정보추가 / 2>정보삭제 / 3>전체정보 보기 / etc>종료");
			int tmp = sc.nextInt();
			switch(tmp) {
			case 1:
				System.out.print("이름 입력:");
				person.setName(sc.next());
				System.out.println();
				System.out.print("나이 입력:");
				person.setAge(sc.nextInt());
				System.out.println();
				System.out.print("전화번호 입력:");
				person.setTel(sc.next());
				System.out.println();
				list.add(person);
				break;
			case 2:
				System.out.print("삭제할 대상의 이름을 입력하세요 :");
				String name = sc.next();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
					}
				}
			case 3:
				for(int i=0;i<list.size();i++) {
					System.out.printf("[이름 : %s / 나이 : %d / 전화번호 : %s]",list.get(i).getName(),list.get(i).getAge(),list.get(i).getTel());
				}
				break;
			default:
				System.out.println("프로그램 종료");
			}
			
				

		}
	}
}
