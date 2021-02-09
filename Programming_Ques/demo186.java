package Output_Of_Java_Programs;

public class demo186 extends test186 {

	protected final void getDetails() {
		System.out.println(" demo class");
	}

	public static void main(String[] args) {
		test186 t = new test186();
		t.getDetails();
	}

}

class test186 {
	protected final void getDetails() {
		System.out.println(" test class");
	}
}

// Compiler error Final and static cannot be override