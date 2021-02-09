package Programming_Ques;

//print left rotation of array in O(1) time and O(1) space
//given an array of size n and multiple value around which we need to left rotate an array.
// I/P : - a [] = {1,3,5,7,9}  d = 3
//O/P :- 79135

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 7, 9 };
		int d = 3;
		letfRotate(a, d);

	}

	private static void letfRotate(int[] a, int d) {
		// TODO Auto-generated method stub
		int len = a.length;
		int mod = d % len;
		for (int i = 0; i < len; i++) {
			System.out.print(a[(i + mod) % len] + " "); //7 9 1 3 5 
		}
	}

}
