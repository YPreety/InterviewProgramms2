package Output_Of_Java_Programs;

public class demo151 {

	static {
		System.out.println("MainClass SIB");
	}

	public static void main(String[] args) {
		// Static Members directly accessed with Class Name
		StaticComponents.staticVariable = 20;
		StaticComponents.staticMethod();
	}
}

class StaticComponents {
	static int staticVariable;

	static {
		System.out.println("StaticComponents SIB");
		staticVariable = 10;
	}

	static void staticMethod() {
		System.out.println("From StaticMethod");
		System.out.println(staticVariable);
	}
}

/*Main Class SIB
StaticComponents SIB
From StaticMethod
20*/