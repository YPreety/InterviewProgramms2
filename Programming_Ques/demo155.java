package Output_Of_Java_Programs;

public class demo155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B155 b = new B155();
		System.out.println("b.i " + b.i);//6
		
		A155 a = new B155();
		System.out.println("a.i " +a.i);//30
		
		A155 a1 = new A155();
		System.out.println("a.i " +a1.i);//62
	}

}

class A155 {
	static int i = 1111;

	static {
		i = i-- - --i;
	}

	{
		i = i++ + ++i;
	}
}

class B155 extends A155 {
	static {
		i = --i - i--;
	}

	{
		i = ++i + i++;
	}
}