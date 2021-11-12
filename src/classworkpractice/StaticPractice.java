package classworkpractice;

public class StaticPractice {
	
	public static void main(String[] args) {
		StaticPractice staticPractic= new StaticPractice();
		staticPractic.student();
		teacher();
		
	}

	
   public void student() {
	  System.out.println("This is void type method"); 
   }
   public static void teacher() {
	 System.out.println("This is static type method");  
   }
}
