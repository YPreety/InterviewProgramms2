package Output_Of_Java_Programs;

public class demo196 {

	public static void main(String[] args) {
		for(int i = 0 ; 1 ; i++){
			System.out.println("hello");//Unresolved compilation problem:Type mismatch: cannot convert from int to boolean
			break;
		}

		for(int i = 0 ; true ; i++){
			System.out.println("hi");//hi
			break;
		}
	}

}
