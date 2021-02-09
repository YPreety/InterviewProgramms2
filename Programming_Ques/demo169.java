package Output_Of_Java_Programs;

public class demo169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = new String(s2);
		String s4 = "abc";

		System.out.println("s1 : " + s1);//abc
		System.out.println("s2 : " + s2);//abc
		System.out.println("s3 : " + s3);//abc
		System.out.println("s4 : " + s4);//abc
		
		// change s2 = "cde"
		s2 = "cde";
		
		System.out.println("s1 : " + s1);//abc
		System.out.println("s2 : " + s2);//cde
		System.out.println("s3 : " + s3);//abc
		System.out.println("s4 : " + s4);//abc

	}

}
