package Output_Of_Java_Programs;

public class demo163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = null;
		String s2 = "test";
		String s3 = new String("test");
		String s4 = "test1";
		String s5 = new String("test1");

		System.out.println(" s1==s2 : " + s1 == s2);// false
		System.out.println(" s1==s3 : " + s1 == s3);// false
		System.out.println(" s1==s4 : " + s1 == s4);/// false
		System.out.println(" s1==s5 : " + s1 == s5);//// false
		System.out.println(" s2 == s3 : " + s2 == s3);// false
		System.out.println(" s2 == s4 : " + s2 == s4);// false
		System.out.println(" s2 == s5 : " + s2 == s5);// false
		System.out.println(" s3 == s4 : " + s3 == s4);// false
		System.out.println(" s3 == s5 : " + s3 == s5);// false
		System.out.println(" s4 == s5 : " + s4 == s5);// false

		System.out.println(" s1.equals(s2) : " + s1.equals(s2));// java.lang.NullPointerException
		System.out.println(" s1.equals(s3) : " + s1.equals(s3));// java.lang.NullPointerException
		System.out.println(" s1.equals(s4) : " + s1.equals(s4));// java.lang.NullPointerException
		System.out.println(" s1.equals(s5) : " + s1.equals(s5));// java.lang.NullPointerException
		System.out.println(" s2.equals(s3) : " + s2.equals(s3));// true
		System.out.println(" s2.equals(s4) : " + s2.equals(s4));// false
		System.out.println(" s2.equals(s5) : " + s2.equals(s5));// false
		System.out.println(" s3.equals(s4) : " + s3.equals(s4));// false
		System.out.println(" s3.equals(s5) : " + s3.equals(s5));// false
		System.out.println(" s4.equals(s5) : " + s4.equals(s5));// true

	}

}
