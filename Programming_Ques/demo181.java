package Output_Of_Java_Programs;

import java.util.PriorityQueue;

public class demo181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(10);
		pq.add(22);
		pq.add(5);
		pq.add(12);
		pq.add(2);
		while (pq.isEmpty() == false) {
			System.out.println(pq.remove());
		}

	}

}
