package Output_Of_Java_Programs;

public class demo205 {
	test205 t = new test205(10);

	demo205(int i) {
		t = new test205(i);
	}

	public static void main(String[] args) {
		demo205 d = new demo205(5);

	}

}

class test205 {
	test205(int x) {
		System.out.println("test205 called " + x);
	}
}
//test205 called 10
//test205 called 5