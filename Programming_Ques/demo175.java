package Output_Of_Java_Programs;

public class demo175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getInt());
	}

	@SuppressWarnings("finally")
	private static int getInt() {
		// TODO Auto-generated method stub
		try {
			System.out.println("in try");
			return 1;
		} catch (Exception e) {
			System.out.println("in catch");
			return 2;
		} finally {
			System.out.println("in finally");
			return 3;
		}
	}
}


/*in try
in finally
3*/