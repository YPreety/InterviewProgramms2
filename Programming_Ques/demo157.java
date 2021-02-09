package Output_Of_Java_Programs;

//Compliation error

public class demo157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A157 a = new B157();
		a.m2();
	}

}

class A157 {
	void m1() {
		System.out.println("In m1 A");
	}
}

class B157 extends A157 {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}