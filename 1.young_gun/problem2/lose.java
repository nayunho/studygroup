package test5;

public class lose {

	String a;
	String b;
	
	public lose(String a,String b) {
		this.a=a;
		this.b=b;
	}
	
	public void result() {
		if(a.equals("묵") &&  b.equals("빠")) {
			System.out.println("졌습니다.");
		}else if(a.equals("찌") &&  b.equals("묵")) {
			System.out.println("졌습니다.");
		}else if(a.equals("빠") &&  b.equals("찌")) {
			System.out.println("졌습니다.");
		}
	}
	
}
