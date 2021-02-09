package Output_Of_Java_Programs;

public class demo179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB1 b = new BBB1(20);
		System.out.println(" b.i : " + b.i);

	}

}

class BBB1 extends AAA1 {
	public BBB1(int j) {
		super(j);
		System.out.println(" B i : " + i);
		this.i = j * 20;
	}
}

class AAA1 {
	int i = 0;

	public AAA1(int j) {
		System.out.println(" A i : " + i);
		this.i = j * 10;
	}
}