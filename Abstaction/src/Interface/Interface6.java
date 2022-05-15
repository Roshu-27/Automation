package Interface;
 interface animal01{
	 int age =25;
	public void Can();
	public void Big();
	 
 }
 class Pig implements animal01{
	 public void Can() {
		 System.out.println(" Can call to zzzz ");
	 }
	 public void Big() {
		 System.out.println(" call to Big ");
	 }
 }
public class Interface6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig a1 =new Pig();
		a1.Can();
		a1.Big();
		System.out.println("my age ="+animal01.age);
	}

}
