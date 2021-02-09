package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:
Function – Object clone( ) Returns a duplicate of the invoking vector.
v1 is a duplicate of v having 1st element as “Geeksforgeeks”*/

public class demo8 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        v.addElement("Java");
        Vector v1 = new Vector();
        v1 = (Vector)v.clone();
        System.out.println(v1.firstElement()); //Geeksforgeeks
	}
}
