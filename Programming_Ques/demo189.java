package Output_Of_Java_Programs;

public class demo189 extends test189 {

	public void getDetails(String s) {
		System.out.println(" demo class " + s);
	}

	public static void main(String[] args) {
		test189 t = new test189();
		t.getDetails("gfg");/// test class gfg

		test189 t1 = new demo189();
		t1.getDetails("hi");/// demo class hi

		demo189 t2 = new demo189();
		t2.getDetails("hello");/// demo class hello

		demo189 t3 = new test189();/// Unresolved compilation problem:
		t3.getDetails("hello");

		demo189 t4 = (demo189) new test189();/// ClassCastException
		t4.getDetails("hello");

	}

}

class test189 {
	public void getDetails(String s) {
		System.out.println(" test class " + s);
	}
}
