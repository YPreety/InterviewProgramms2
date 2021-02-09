package Programming_Ques;

//I/P : - a [] = {1,2,3,4,5,6,7}  d = 2
//O/P :- 3,4,5,6,7,1,2

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		letfRotate(a, d);
		printArray(a);
	}

	private static void letfRotate(int[] a, int d) {
		// TODO Auto-generated method stub
		int len = a.length;
		for (int i = 0; i < d; i++) {
			leftrotateByOne(a, len);
		}
	}

	private static void leftrotateByOne(int[] a, int len) {
		// TODO Auto-generated method stub
		int i;
		int temp = a[0];
		for (i = 0; i < len - 1; i++) {
			a[i] = a[i + 1];
		}
		a[i] = temp;
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
