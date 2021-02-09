package Output_Of_Java_Programs;

public class demo167 {

	public static void DoPrint(P1 o) {
		o.Print();
	}

	public static void main(String[] args) {
		P1 x = new P1();
		P1 y = new P2();
		P2 z = new P2();
		DoPrint(x);// P1
		DoPrint(y);// P2
		DoPrint(z);// P1

	}

}

class P1 {
	public void Print() {
		System.out.println("P1");
	}
}

class P2 extends P1 {
	public void Print() {
		System.out.println("P2");
	}
}