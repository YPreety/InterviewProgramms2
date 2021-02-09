package Output_Of_Java_Programs;

public class demo194 extends test194 {

	public void getDetails() {
		System.out.println(" demo class ");
		super.getDetails();// test class 
	}

	public static void main(String[] args) {
		test194 t = new demo194();
		t.getDetails();// demo class

	}

}

class test194 {
	public void getDetails() {
		System.out.println(" test class ");
	}
}