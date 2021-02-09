package Output_Of_Java_Programs;

import java.io.IOException;

//Compilation error

public class demo159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A159 a = new B159();
		try {
			a.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class A159 {
	void m1() throws IOException {
		System.out.println("In m1 A");
	}
}

class B159 extends A159 {
	void m1() throws Exception {
		System.out.println("In m1 B");
	}
}