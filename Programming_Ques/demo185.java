package Output_Of_Java_Programs;

public class demo185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mma a = new Mmb();
		a.disp();// inside disp Mmb
		a.show();// inside show Mmb

		Mmb b = new Mmb();
		b.disp();// inside disp Mmb
		b.show();// inside show Mmb

	}

}

class Mma {
	protected void disp() {
		System.out.println("inside disp Mma");
	}

	protected void show() {
		System.out.println("inside show Mma");
	}
}

class Mmb extends Mma {
	protected void disp() {
		System.out.println("inside disp Mmb"); // if method is protected complier error
	}

	protected void show() {
		System.out.println("inside show Mmb");// if method is protected complier error
	}
}