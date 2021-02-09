package Output_Of_Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class demo161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee161 emp1 = new Employee161("Martin", 27);
		Map<Employee161, String> hm = new HashMap<Employee161, String>();
		hm.put(emp1, "Verified");
		emp1.setName("John");
		System.out.println(hm.get(emp1)); //null
	}

}

class Employee161 {
	String name;
	int age;

	public Employee161(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee161 other = (Employee161) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}