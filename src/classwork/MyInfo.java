package classwork;

public class MyInfo {
   // This is a main method.
	public static void main(String[] args) {
		MyInfo info=new MyInfo();
		info.myInfo();
	}
	// This is class variables.
	public String MyName = "Tofael"; // String is not a pure primitive type Data
	public byte myAge = 80;
	public short myHouseRent = 28000;
	public int myYearlySalary = 250000; // mostly used
	public long myBankBalance = 765762765365873l;
	public char mySex = 'M';
	public float myHeight = 1.70f;
	public double myGrade = 3.34237479237;
	public boolean usCitizen = false;
    // This is a default constructor of this class.
	public MyInfo() {
		System.out.println("This is a default constructor");
	}
	// This is void type method.
	public void myInfo() {
		System.out.println("My Name: "+MyName+"\nMy Age: "+myAge+"\nMy house rent: "+myHouseRent+"\nMy yearly salary: "
				+myYearlySalary+"\nMy Sex: "+mySex+"\nMy height: "+myHeight+"\nMy grade: "+myGrade+"\nUS citizen: "+
				usCitizen);
	}
	
}
