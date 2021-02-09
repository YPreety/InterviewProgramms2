package Output_Of_Java_Programs;

public class demo178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mm1();
		System.out.print("inside main");
	}

	private static void mm1() {
		try {
			mm2();
			System.out.print("inside try");
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.print("inside catch");
		} finally {
			System.out.print("inside finally");
		}

	}

	private static void mm2() {
		// TODO Auto-generated method stub
		mm3();
	}

	private static void mm3() {
		// TODO Auto-generated method stub
		int i = 9 / 0;
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}
