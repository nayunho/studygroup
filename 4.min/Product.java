package test3;

class Product{

//private 변수 선언
//상품번호, 상품명, 회사명, 가격, 출고상품 횟수
//변수명은 자유롭게
	private int mNum = 0, mPrice = 0;
	private String mName = null, mWhere;

	private static int count = 0;

	//생성자
	public Product(String prduct, String com, int mPrice) {
		this.mName=prduct;
		this.mWhere=com;
		this.mPrice=mPrice;
	}

	//getter setter
	
	public static int getCount(int count) {
		return count;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmWhere() {
		return mWhere;
	}

	public void setmWhere(String mWhere) {
		this.mWhere = mWhere;
	}



}