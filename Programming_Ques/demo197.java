package Output_Of_Java_Programs;

public class demo197 {

	public static void main(String[] args) {
		System.out.println(fun());// Unresolved compilation problem: Cannot make a static reference to the non-static method

		System.out.println(fun1());// 20
	}

	static int fun1() {
		return 20;
	}

	int fun() {
		return 20;
	}

}
