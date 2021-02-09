package Output_Of_Java_Programs;

public class demo188 extends test188 {
	
	public int getDetails(String s) {
		System.out.println(" demo class " + s);
		return 0;
	}

	public static void main(String[] args) {
		test188 t = new test188();
		t.getDetails("gfg");
	}

}

class test188 {
	public void getDetails(String s) {
		System.out.println(" test class " + s);
	}
}

// test class gfg