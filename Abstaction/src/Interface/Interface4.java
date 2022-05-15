
package Interface;

 interface Printable1{
	 void How();
	 
 }
 interface Showable1 extends Printable1{
	 void Show();
	 //void How(); public abstract void How ();---> inherited method	 
	 
 }
public class Interface4 implements Showable1{
		public void How() {
			System.out.println("hii i am how method");
		}
		public void Show() {
			System.out.println(" hii i am show method ");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface4 a1 = new Interface4();
		a1.Show();
		a1.How();
		Printable1 a2 =new Interface4();
		a2.How();
	}

}
