package Output_Of_Java_Programs;

public class demo198 {

	private static int x;

	public static void main(String[] args) {
		System.out.println(fun());// 1   //1
		System.out.println(fun1());// 0  //1
		System.out.println(fun2());//1   //2
	
		System.out.println(fun2());// 0  //2
		System.out.println(fun1());// 0  //2
		System.out.println(fun());//1    //4

	}

	private static int fun2() {
		return x;
	}

	private static int fun1() {
		return x++;
	}

	private static int fun() {
		return ++x;
	}

}
