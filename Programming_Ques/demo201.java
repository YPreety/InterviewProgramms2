package Output_Of_Java_Programs;

public class demo201 {

	public static void main(String[] args) {
		test201 t = new test201();
		System.out.println(t.x + " " + t.y);//Unresolved compilation problem:The constructor test201() is undefined

	}

}

class test201 {
	protected int x, y;

	public test201(int x, int y) {
		x = x;
		y = y;
	}
}