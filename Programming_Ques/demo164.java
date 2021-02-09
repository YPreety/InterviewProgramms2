package Output_Of_Java_Programs;

public class demo164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Test();
		} catch (Test t) {
			System.out.println("Got the Test Exception");
		} finally {
			System.out.println("Inside finally block ");
		}

	}

}

class Test extends Exception {
}

/*Got the Test Exception
Inside finally block */
