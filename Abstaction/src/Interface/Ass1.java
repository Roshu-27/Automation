package Interface;
	 interface gang{
		 void W();
		 void S();
		 
	 }
	 interface  Don{
		 public void W();
		 public void S(); 	 
	 }
	 
public class Ass1 implements gang, Don{
	 public void W() {
		System.out.println("I am method W  ");
	}
	 public void S() {
		 System.out.println("i am method s ");
	 }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Don a1 =new Ass1();
		a1.W();
		a1.S();
		
	}

}
