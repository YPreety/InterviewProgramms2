package Output_Of_Java_Programs;

public class demo171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BBBB b1 = new BBBB();
		BBBB b2 = new BBBB();
		System.out.println("in main");// 11
	}

}

class AAAA {
	AAAA() {
		System.out.println("in AAAA");// 4 ,8
	}

	{
		System.out.println("in IIB- AAAA");// 3 , 7
	}
	static {
		System.out.println("in SIB- AAAA"); // 1
	}
}

class BBBB extends AAAA {
	BBBB() {
		System.out.println("in BBBB");// 6 , 10
	}

	{
		System.out.println("in IIB- BBBB");// 5 , 9
	}
	static {
		System.out.println("in SIB- BBBB");// 2
	}
}