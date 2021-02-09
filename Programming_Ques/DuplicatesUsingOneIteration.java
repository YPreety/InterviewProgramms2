package Programming_Ques;

public class DuplicatesUsingOneIteration {

	public static void main(String[] args) {
		int a[] = { 3, 7, 3, 5, 8, 9, 2, 4, 8, 9 };
		int temp[] = new int[100];
		for (int i = 0; i < a.length; i++) {
			if (temp[a[i]] == 0) {
				temp[a[i]] = 1;
			} else {
				System.out.println("a[i] values : " + a[i] + " ");
			}
		}

	}

}
