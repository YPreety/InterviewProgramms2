package Output_Of_Java_Programs;

public class demo184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ma a = new Mb();
		a.disp();//inside disp Mb
		a.show();//inside show Ma

		Mb b = new Mb();
		b.disp();//inside disp Mb
		b.show();//inside show Ma
	}

}

class Ma {
	public void disp() {
		System.out.println("inside disp Ma");
	}

	public void show() {
		System.out.println("inside show Ma");
	}
}

class Mb extends Ma {
	public void disp() {
		System.out.println("inside disp Mb");
	}

}