package Output_Of_Java_Programs;

public class demo153 {

	static int a = 1111;
	
	static{
		a = a-- - --a;
	}
	
	{
		a= a++ + ++a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello have are you";
		System.out.println(a);//2
		System.out.println(str.length()- str.split(" ").length+1); // latter count 15
	}

}
