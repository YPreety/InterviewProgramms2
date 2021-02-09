package Output_Of_Java_Programs;

public class demo170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BBB b = new BBB();
		System.out.println("in main");//7
	}

}

class AAA {
	AAA() {
		System.out.println("in AAA");//4
	}

	{
		System.out.println("in IIB- AAA");//3
	}
	static {
		System.out.println("in SIB- AAA"); //1
	}
}

class BBB extends AAA {
	BBB() {
		System.out.println("in BBB");//6
	}

	{
		System.out.println("in IIB- BBB");//5
	}
	static {
		System.out.println("in SIB- BBB");//2
	}
}