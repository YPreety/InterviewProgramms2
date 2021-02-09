package Output_Of_Java_Programs;

import java.io.IOException;

public class demo193 extends test193 {

	public void getDetails() throws Exception {
		System.out.println(" demo class "); 
	}

	public static void main(String[] args) throws Exception {
		test193 t = new demo193();
		t.getDetails();// demo class
		
		test193 t1 = new test193();
		t1.getDetails();//  test class 
	}

}

class test193 {
	public void getDetails() throws IOException, Exception {
		System.out.println(" test class ");
	}
}