package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:int indexOf(Object E, int start):– Returns the index of the first occurrence of element E at or after start. 
Hence the index of “Geeksforgeeks” is returned after index ‘2’.*/
public class demo7 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        v.addElement("Java");
        v.addElement("C++");
        v.addElement("C");
        v.addElement("Geeksforgeeks");
        System.out.println(v.indexOf("Geeksforgeeks", 2)); //4 
	}
}
