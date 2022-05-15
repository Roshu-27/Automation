package Abstarction;

	abstract  class Hellow{
		public abstract void Method1();
		public void Sound() {
		System.out.println(" i amd Sound ");
		}
	}
	class Dual extends Hellow{
	public void Method1(){
		System.out.println(" i am method1");
	}
	public void Sound() {
		System.out.println("i am method sound inherit ");
	}
	}
	class Triple extends Hellow{
		public void Method1(){
			System.out.println(" i am method1 call ");
		}
		public void Sound() {
		System.out.println(" i have call to sound method");
		}
	}
public class AbstractClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dual a = new Dual();
		a.Method1();
		a.Sound();
		Triple a1 = new Triple();
		a1.Method1();
		a1.Sound();
	}

}
