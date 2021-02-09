package Output_Of_Java_Programs;

public class demo182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base12 b = new Base12(20);
		b.myMethod();
	}

}

class Base12 {
	private Base12(int data) {
		System.out.println("constructor call");
	}

	protected static Base12 create(int data) {
		Base12 b = new Base12(data);
		return b;
	}

	public void myMethod() {
		System.out.println("method call");
	}
}