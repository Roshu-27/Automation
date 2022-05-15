package Abstarction;

 abstract class Hero1{
	 abstract void Role();
	 void Acting (int a) {
		 System.out.println("i am acting method of abstract class="+a);
	 }
 }
class Actor extends Hero1{
	void Role() {
		System.out.println("I am non abstract method of abstract class run  ");
	}
	void Acting(int a) {
		super.Acting(a);
		System.out.println("I am non abstract method of abstract class a="+a	);
		
	}
		void Call() {
			System.out.println("I am call method ");
		}
}
public class AbstractClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor a1 = new Actor();
		a1.Role();
		a1.Acting(65);
		a1.Call();
		Hero1 a2 = new Actor();
		a2.Role();
		a2.Acting(55);
		//a2.Call();
		

	}

}
