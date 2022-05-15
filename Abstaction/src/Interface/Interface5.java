package Interface;
 interface Hello{
	 int age =56;
	 void Hii();
	 
 }
 	interface Hello2{
 		void Hii();
 		
 	}
public class Interface5 implements Hello,Hello2{
	public void Hii() {
		System.out.println("I am Hii Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface5 a1 = new Interface5();
		a1.Hii();
		System.out.println("Age="+Hello.age);
	}

}
