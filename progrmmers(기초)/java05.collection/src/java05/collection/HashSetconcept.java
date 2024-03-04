package java05.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetconcept {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<>();
		set.add("java");
		set.add("DATABASE");
		set.add("java");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		System.out.println();
		
		Set<Users> users= new HashSet<>();
		
		users.add(new Users("손흥민",32));
		users.add(new Users("손흥민",10));
		users.add(new Users("손흥민",32));
		
		Iterator<Users> iter1 = users.iterator();
		while(iter1.hasNext()) {
			Users element = iter1.next();
			System.out.println(element);
		}	
	}
}

class Users{
	String name;
	int age;
	
	public Users(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
