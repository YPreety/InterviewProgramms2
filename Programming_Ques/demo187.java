package Output_Of_Java_Programs;

public class demo187 extends test187 {

	protected final void getDetails() {
		System.out.println(" demo class");
	}

	public static void main(String[] args) {
		test187 t = new test187();
		t.getDetails();
	}
}

class test187 {
	protected void getDetails() {
		System.out.println(" test class");
	}
}

// test class