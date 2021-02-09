package Output_Of_Java_Programs;

import java.util.HashSet;

//size = 2 we are not created equals and hashcode method
//size = 2 only equals method
//size = 2 only hashcode method
//size = 1 equals and hashcode method
public class demo160 {

	String name;
	int age;

	demo160(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo160 c1 = new demo160("John", 20);
		demo160 c2 = new demo160("John", 20);

		HashSet<demo160> customerSet = new HashSet<>();
		customerSet.add(c1);
		customerSet.add(c2);
		System.out.println(customerSet.size()); //1

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
		demo160 other = (demo160) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
