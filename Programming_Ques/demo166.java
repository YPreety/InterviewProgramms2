package Output_Of_Java_Programs;

class M {
	protected void getData() {
		System.out.println("Inside M get Data");
	}
}

class N extends M {
	protected void getData() {
		System.out.println("Inside N get Data");
	}

	public void show() {
		System.out.println("Inside N show");
	}
}

public class demo166 {

	public static void main(String[] args) {
		M obj = new N();
		obj.getData(); // Inside N get Data

		M obj1 = new M();
		obj1.getData();// Inside M get Data

		N obj2 = new N();
		obj2.getData();// Inside N get Data

		N obj3 = new M(); // Type mismatch: cannot convert from M to N
		obj3.getData();

		N obj4 = (N) new M(); // java.lang.ClassCastException: M cannot be cast to N
		obj4.getData();

		M a = new N();
		a.show();// Unresolved compilation problem : The method show() is undefined for the type M

		M a1 = new M();
		a1.show();// Unresolved compilation problem : The method show() is undefined for the type M

		N a2 = new N();
		a2.show();// Inside N show

		N a3 = new M();
		a3.show();// Unresolved compilation problem : The method show() is undefined for the type M

		N a4 = (N) new M(); // java.lang.ClassCastException: M cannot be cast to N
		a4.show();

	}

}