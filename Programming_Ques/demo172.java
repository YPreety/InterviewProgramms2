package Output_Of_Java_Programs;

public class demo172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b = new BB();
		System.out.println("in main");//5
	}

}

class AA {
	AA() {
		System.out.println("in AA");// 2
	}

	{
		System.out.println("in IIB- AA");//1
	}

}

class BB extends AA {
	BB() {
		System.out.println("in BB");// 4
	}

	{
		System.out.println("in IIB- BB");// 3
	}

}