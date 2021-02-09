package Output_Of_Java_Programs;

import java.util.HashMap;
import java.util.Iterator;

//Japan
//ConcurrentModificationException

public class demo162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("France", "Paris");
		map.put("Russia", "Moscow");

		Iterator<String> countryKeySetIterator = map.keySet().iterator();
		while (countryKeySetIterator.hasNext()) {
			String countryKey = countryKeySetIterator.next();
			map.put("Nepal", "KathMandu");
			System.out.println(countryKey);

		}
		System.out.println("-----------------------------");
	}

}

/*Japan
Exception in thread "main" java.util.ConcurrentModificationException*/