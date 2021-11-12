package classwork;

/* DECLARE ONE CLASS VARIABLE, MAKE SURE NOT INITIALIZE. CREATE ONE DEFAULT AND ONE PARAMETIZE CONSTRUCTOR AND USE ONE SYSOUT FOR EACH. THEN CREATE ONE DEFAULT VOID TYPE METHOD AND USE CLASS VARIBLES INSIDE SYSOUT AND ALSO CREATE ONE VOID TYPE PARAMETERIZE METHOD AND CALL SYSOUT.
 */
public class Mukta {   // Variables Declare;
	public String Name;
	public int age;
	public int address;
	public boolean usCitizen;
	
	public static void main(String[] args) {
		Mukta mukta=new Mukta();
		new Mukta("MUKTA",30,4585, false);
		mukta.mukta1();
		mukta.mukta11("EN THRALL", 25, 4584, false);
		
	}
	
	public Mukta() {//Defaul Constructor
		System.out.println("This all about me");
		
	}	
	public Mukta(String Name, int age,int Address,boolean usCitizen ) { //ParameterizedType constructor
		System.out.println("My Name: " +Name+"\nMy age: " +age+ "\nAddress: " +address+"\nUsCitizen: us Citizen");
	}	
	public void mukta1() {
		System.out.println("My Name: " +Name+"\nMy Phone number: " +age+"\nAddress" +address+"\nUsCitizen: "+usCitizen);
		}
	public void mukta11(String Name, int age, int Address, boolean usCitizen) {
		System.out.println("My Name: " +Name+"\nMy age: " +age+ "\nAddress: " +address+"\nUsCitizen: "+usCitizen);
	}
}
 

	
	























