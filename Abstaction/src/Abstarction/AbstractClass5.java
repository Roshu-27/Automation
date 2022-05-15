package Abstarction;

abstract class Human{
	abstract void Boy();// In real scenario, implementation is provided by others i.e. unknown by end user
}
	class People extends Human{
		protected void Boy() {
			System.out.println(" i am boy method");
		}
	}
	class Multiple extends Human{
		public void Boy() {
			System.out.println("I am inherited method ");
		}
	}
public class AbstractClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a1 =new People();
		a1.Boy();
		//Multiple a2 = new Multiple();
		//a2.Boy();
		
		
	}

}
