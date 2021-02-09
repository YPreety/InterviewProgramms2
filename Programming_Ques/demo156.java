package Output_Of_Java_Programs;

/*Note :- 
1. if we pass string and StringBuffer as parameter in foo then output will be Unresolved compilation problem The method foo(Object) is ambiguous
2. if we pass string and StringBuilder as parameter in foo then output will be Unresolved compilation problem The method foo(Object) is ambiguous
3. if we pass string , StringBuffer and StringBuilder as parameter in foo then output will be Unresolved compilation problem The method foo(Object) is ambiguous
4. if we pass StringBuffer and StringBuilder as parameter in foo then output will be Unresolved compilation problem The method foo(Object) is ambiguous
5. if we pass string as parameter in foo then output will String impl
6. if we pass StringBuffer as parameter in foo then output will StringBuffer impl
7. if we pass StringBuilder as parameter in foo then output will StringBuilder impl

*/

public class demo156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(null);
	}

	public static void foo(Object o) {
		System.out.println("Object impl");
	}

	public static void foo(String s) {
		System.out.println("String impl");// String impl
	}

	public static void foo(StringBuffer s) {
		System.out.println("StringBuffer impl");// StringBuffer impl
	}
	
	public static void foo(StringBuilder s) {
		System.out.println("StringBuilder impl");//StringBuilder impl
	}


}

