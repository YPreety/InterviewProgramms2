package Output_Of_Java_Programs;

import java.io.IOException;

public class demo192 extends test192 {

	public void getDetails() throws Exception { 
		System.out.println(" demo class ");
	}

	public static void main(String[] args) throws IOException { //Unhandled exception type Exception
		test192 t = new demo192();
		t.getDetails();
	}

}

class test192 {
	public void getDetails() throws IOException, Exception {
		System.out.println(" test class ");
	}
}