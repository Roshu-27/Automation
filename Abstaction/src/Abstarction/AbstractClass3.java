package Abstarction;

abstract class P {
	abstract void Method();

	void Me(int a) {
		System.out.println("i am method me ");
	}
}

class S extends P {
	void Method() {
		System.out.println("i am Non abstract method");
	}

	void Me(int a) {
		System.out.println("I am overrided method Me" + a);
	}

}

public class AbstractClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	S a = new S();
		a.Method();
		a.Me(25);

	}

}
