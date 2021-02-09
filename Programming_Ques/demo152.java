package Output_Of_Java_Programs;

public class demo152 {

	public static void main(String[] args) {
		C.staticVariable = 10;
		// A.nonStaticVariable = 10;
		C.staticMethod();
		// A.nonStaticMethod();

		C a1 = new C();
		C a2 = new C();

		System.out.println(a1.nonStaticVariable);
		System.out.println(a1.staticVariable);
		a1.nonStaticMethod();
		a1.staticMethod();

		System.out.println(a2.staticVariable);
		a1.staticVariable = 20;
		System.out.println(a2.staticVariable);

	}

}

class C {
	int nonStaticVariable;
	static int staticVariable;

	static void staticMethod() {
		System.out.println(staticVariable);
		// System.out.println(nonStaticVariable);
	}

	void nonStaticMethod() {
		System.out.println(staticVariable);
		System.out.println(nonStaticVariable);
	}
}

/*10
0
10
10
0
10
10
20*/