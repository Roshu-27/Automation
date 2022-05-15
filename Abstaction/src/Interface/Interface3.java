package Interface;

interface Bank{
		int age =25;
		void bank();
}
	interface Central{
		public void bank();
	}

public class Interface3 implements Bank,Central {
	public static int age =45;
	 public void bank() {
		 System.out.println("hello bank");
		 
	 }
	 public void central() {
		 System.out.println("hello central ");
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface3 a1= new Interface3();
		a1.bank();//Hello bank
		a1.central();//hello central 
		System.out.println("I am Interface age ="+Interface3.age);// 45
		System.out.println("I am age of bank age ="+Bank.age);//25
		

	}

}
