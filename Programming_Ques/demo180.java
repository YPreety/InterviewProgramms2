package Output_Of_Java_Programs;

import java.io.IOException;

public class demo180 extends Base11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo180 d = new demo180();
		d.display();
	}

	public void display() throws IOException {
		System.out.print("demo180");
	}
}

class Base11 {
	public void display() throws IOException {
		System.out.print("test");
	}
}