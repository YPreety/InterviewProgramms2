package Output_Of_Java_Programs;

public class demo190 extends test190 {

	protected void getDetails() {
		System.out.println(" demo class ");
	}

	public static void main(String[] args) {
		demo190 t = new test190();
		t.getDetails();
	}

}

class test190 {
	public void getDetails() {
		System.out.println(" test class ");
	}
}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from test190 to demo190*/