package Abstarction;

abstract class Central {
	abstract float GetInterest();

	final void loan() {
		System.out.println("I am central loan method  ");
	}
}

class SBI1 extends Central {
	float GetInterest() {
		return 6.5f;
	}

}

class JDCC extends Central {
	float GetInterest() {
		return 7.5f;
	}
}


public class AbstractClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDCC a1 = new JDCC();
		a1.loan();
		System.out.println("I am JDCC take interest " + a1.GetInterest() + "%");
		SBI1 a2 = new SBI1();
		System.out.println(" i am SBI1 take interest " + a2.GetInterest() + " %");
		Central a3 = new JDCC();
		System.out.println(" i am obj of JDCC take interest" + a3.GetInterest() + "%");
		Central a4 = new SBI1();
		System.out.println(" i am obj of SBI1 take interest" + a4.GetInterest() + "%");

	}

}
