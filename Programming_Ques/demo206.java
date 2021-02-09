package Output_Of_Java_Programs;

public class demo206 {

	public static void main(String[] args) {
		test206 t = new test206();//Unresolved compilation problem:The constructor test206() is undefined
		test206 t2 = new test206(t);

	}

}

class test206 {
	private double re, im;

	test206(test206 t) {
		re = t.re;
		im = t.im;
	}

	@Override
	public String toString() {
		return "test206 [re=" + re + ", im=" + im + "]";
	}

}