package Output_Of_Java_Programs;

interface Anonymous {
	public int getValue();
	//public int getData();
}

public class demo183 {

	private int data = 15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous a = new Anonymous(){
			int data = 5;
			public int getValue(){
				return data;
			}
			public int getData(){
				return data;
			}
		};
		demo183 d = new demo183();
		System.out.println(a.getValue() + a.getData() + d.data);
	}

}
