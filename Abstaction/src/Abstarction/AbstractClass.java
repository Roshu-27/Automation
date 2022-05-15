package Abstarction;

abstract class A{// this class not 100% abstract 
	abstract public void AS();// abstract method does not have body.
	public void AB() {
		System.out.println("I am without abstract method AB / non abstract method");
	} 	
	
}
	abstract class B{// Q can we write non abstract method in abstract class.
	 void display() {// Ans --> yes we can write non abstract in abstract class.
		System.out.println("i am non abstract method without abstract class  ");
	 }
			
		}
	class AC{
	//	abstract void display();// Q-> can we write abstract method in non abstract class.
		// Ans-->No  we cant write the the abstract in non abstract class give the compilation error thats a incomplete method 
	}
	abstract class AD{ // this class is 100% abstract class 
		abstract void Print();
		abstract void Print1();
		abstract void Print2();
	}
	abstract class AE{
	}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* The class declared with abstract keyword  is known as abstract class 0 to 100 %
 * It will have 
 * Abstract method ---> the abstract method declared with abstract keyword and without body({}).
 * Non Abstract method --> the abstract method called as normal method or concrete method  
 * constructor
 * static method 
 * global variable 
 * abstract class dont be created object thats important point 
 * if any class contain even one abstract method then that should be declared abstract class  
 * when an abstract class is getting inherited by a sub class, dn there will a contract between these classes thats
 *  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes
 *  abstract class
 * */
