package test;

public abstract class Employee {

	//매개변수
	public String name;
	public String job;
	public int empNo;
	public int pay;

	//생성자
	public Employee() {
	}
	
	public Employee(String name, String job, int empNo, int pay) {
		this.name = name;
		this.job = job;
		this.empNo = empNo;
		this.pay = pay;
	}



	//일반 메서드
	public void project() {
		System.out.println(this.name + "의 직책은 " + this.job + " 사원번호는 " + this.empNo+"입니다.");	
		System.out.println("프로젝트를 진행 하고 있습니다.");
	}

	//추상 메서드
	abstract void develop();
	abstract void upgrade();
	abstract void pay_result();
}