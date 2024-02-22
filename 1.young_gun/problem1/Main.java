package test;

public class Main {

	public static void main(String[] args) {

		System.out.println("----직원 정보 ---");
		
		Employee person = new James("손흥민", "과장", 120,3000000 );
		print(person);
		
		person = new Tomas("김민재", "대리", 127,2000000 );
		print(person);
	}
	public static void print(Employee person) {
		person.project();
		person.develop();
		person.upgrade();
		person.pay_result();
		System.out.println();
	}

}
