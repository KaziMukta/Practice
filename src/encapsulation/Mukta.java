package encapsulation;

public class Mukta {

	private int ssn=9090;
	private int saving=30000;
	private int withdraw;
	private int houseRent;
	private int expense=1000;
	
	public int getSsn() {
		System.out.println(ssn);
		return ssn;
	}
	public int getSaving() {
		System.out.println(saving);
		return saving;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw=withdraw;
	}
	public int getWithdraw() {
		System.out.println(withdraw);
		return withdraw;
	}	
	public void setHouseRent(int houseRent) {
		this.houseRent=houseRent;	
	}
	public int getHouseRent() {
		System.out.println(houseRent);
		return houseRent;	
	}
	public int expense() {
		System.out.println(expense);
		return expense;
	}	
}

