package Output_Of_Java_Programs;

import java.io.IOException;

public class demo176 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BB2 b = new BB2();
		b.get();
	}

}

class AA2 {
	public void get() throws IOException {
		System.out.print("inside get() AA2");
	}
}

class BB2 extends AA2 {
	public void get() throws IOException {
		System.out.print("inside get() BB2");
	}
}

/**
 * sub class method with NullPointerException and main without exception--- inside get() BB2 
 * sub class sub class method with Exception and main without exception --- Unresolved compilation problem 
 * sub class method with IOException and main without exception --- Unresolved compilation problem 
 * sub class method with IOException and main with IOException --- inside get() BB2
 * sub class method with IOException , static and main with IOException --- inside get() AA2
 * sub class method with IOException , protected and main with IOException --- Unresolved compilation problem
 * sub class method with IOException , private and main with IOException --- Unresolved compilation problem
 * sub class method with IOException , default and main with IOException --- Unresolved compilation problem
 */