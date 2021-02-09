package Output_Of_Java_Programs;

import java.util.Vector;

//Explanation: int indexOf(Object E) :- Returns the index of the first occurrence of element E.

public class demo6 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        v.insertElementAt("Java", 0);
        System.out.println(v.indexOf("Geeksforgeeks")); //1
	}
}
