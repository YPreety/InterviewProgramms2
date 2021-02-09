package Output_Of_Java_Programs;

public class demo173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 9 / 0;

		try {
			System.out.println("in try");
		} catch (Exception e) {
			System.out.println("in catch");
		} finally {
			System.out.println("in finally");
		}
	}

}

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at Output_Of_Java_Programs.demo173.main(demo173.java:8)*/