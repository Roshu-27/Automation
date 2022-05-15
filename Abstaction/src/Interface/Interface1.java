package Interface;

	interface A1{
		// variable ---> default ---> public static final 
		// methods ----> default ----. abstract public 
		//no constructor 
	}
	// Implementation if interface by first user 
	
		interface Print{
			int salary = 250552;// here default is public static final int salary =250552;
			void main();		// here default is public abstract vid main();
			
		}
		
		class printable implements Print{
			public void main() {
				System.out.println("i am print ");	
			}
		}
		class Copy implements Print{
			public void main() {
				System.out.println(" i am interface by copy ");
				
			}
		}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" i am salary variable salary ="+Print.salary);
		printable a1 =new printable();
		a1.main();// i am print 
		Copy a2 = new  Copy();
		a2.main();// i am interface of copy 
		// in real scenario is 
		Print a3 = new Copy();
		a3.main();//i am interface of copy 
		
		

	}

}
