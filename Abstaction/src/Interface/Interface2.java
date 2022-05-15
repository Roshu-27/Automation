package Interface;

interface I{
	double Gang();// here default is public abstract 
	
}
	class J implements I{
		public double Gang() {
			return 9.15;
		}
	} 
	class k implements I{
		public double Gang(){
			return 6.99;
		}	
		}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J a1 = new J();
		System.out.println("I am Gang of class J=="+a1.Gang());//9.15
		k a2 = new k();
		System.out.println("I am Gang of class k== "+a2.Gang());//6.99
		I a3 = new J();
		System.out.println("i am gang of class K=="+a3.Gang());//9.15
	}

}
