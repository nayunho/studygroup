package test;

public class Tomas extends Employee {

	//상속 받은 변수
	public Tomas(String name, String job, int empNo, int pay) {
		super(name,job,empNo,pay);
	}
	// 자식 클래스에서 오버라이드 진행
	
	@Override
	void develop() {
		System.out.println("React 개발을 하고 있습니다.");	
		System.out.println("Java Script 개발을 하고 있습니다.");	
		
	}

	@Override
	void pay_result() {
		System.out.println(this.job + "의 월급은" + this.pay +"입니다");
		
	}

	@Override
	void upgrade() {
		System.out.println("내년에 승진하지 못합니다.");
		
	}
}
