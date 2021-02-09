package Output_Of_Java_Programs;

public class demo199 {

	public static void c1(test199 t) {
		t.m();
	}

	public static void main(String[] args) {
		test199 t = new test199();
		c1(t);// test199
		test199 t2 = new test198();
		c1(t2);// test198
		test198 t3 = new test198();
		c1(t3);// test198

	}

}

class test199 {
	public void m() {
		System.out.println("test199");
	}
}

class test198 extends test199 {
	public void m() {
		System.out.println("test198");
	}
}