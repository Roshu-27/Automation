package Interface;

interface A5{
	void Print();
	void Print2();
	}
	interface B5 extends  A5{
	public void Print();
	public void Print2();
	}
class C5 implements A5{
	public void Print() {
	System.out.println("i am print 1"); 
	}
	public void Print2() {
		System.out.println("I am print 2");
	}
		
	}
public class Ass2 implements A5,B5 {
	public void Print() {
		System.out.println("I am print method inherited ");
	}
	public void Print2() {
		System.out.println("I am Print 2 method inherited");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C5 a1 = new C5();
		a1.Print();
		a1.Print2();
		Ass2 a3 = new Ass2();
		a3.Print();
		a3.Print2();
		A5 a2 =new Ass2();
		a2.Print();
		a2.Print2();
	}

}
