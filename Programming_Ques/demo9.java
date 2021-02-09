package Output_Of_Java_Programs;

import java.util.Vector;

public class demo9 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
		v.addElement("Geeksforgeeks");
		Vector v1 = new Vector();
		v1 = (Vector) v.clone();
		System.out.println(v1.firstElement()); //Geeksforgeeks

		v.insertElementAt("Java", 0);
		System.out.println(v1.firstElement()); //Geeksforgeeks
	}
}
