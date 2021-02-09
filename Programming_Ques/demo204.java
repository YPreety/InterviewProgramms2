package Output_Of_Java_Programs;

public class demo204 {

	public static void main(String[] args) {
		test204 t = new test204();
		t.foo();//Unresolved compilation problem

	}

}

class test204 {
	protected void foo() {
	}
}

class test203 extends test204 {
	default void foo() {
	}
}