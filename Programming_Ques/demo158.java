package Output_Of_Java_Programs;

//In m1 B

public class demo158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A158 a = new B158();
		a.m1();
	}

}

class A158 {
	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println("In m1 A");
	}
}

class B158 extends A158 {
	void m1() throws IndexOutOfBoundsException {
		System.out.println("In m1 B");
	}
}