package Output_Of_Java_Programs;

import java.io.IOException;

public class demo191 extends test191 {

	public void getDetails() throws Exception { /// Exception Exception is not compatible with throws clause
		System.out.println(" demo class ");
	}

	public static void main(String[] args) throws IOException {
		test191 t = new demo191();
		t.getDetails();
	}

}

class test191 {
	public void getDetails() throws IOException {
		System.out.println(" test class ");
	}
}