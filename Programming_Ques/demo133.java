package Output_Of_Java_Programs;

public class demo133 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if (b1 & b2 | b2 & b3 | b2) /* Line 8 */
			System.out.print("ok ");
		if (b1 & b2 | b2 & b3 | b2 | b1) /* Line 10 */
			System.out.println("dokey"); //dokey

	}

}
