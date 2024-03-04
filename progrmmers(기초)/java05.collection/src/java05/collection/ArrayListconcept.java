package java05.collection;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
public class ArrayListconcept {

	public static void main(String[] args) {
		
		List list1= new ArrayList();
		
		list1.add("문자열");
		list1.add(new String("문자열"));
		list1.add(100);
		
		list1.add(new User());
		list1.add(new Member());
		
		String str1=(String)list1.get(0);//강제형변환
		String str2 =(String) list1.get(1);
		int age= (int)list1.get(2);
		User str3 =(User)list1.get(3);
		Member str4 =(Member)list1.get(4);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("======================");
		
		List<String> list2= new ArrayList<>();
		list2.add("문자열");
		//list2.add(new User()); 오류발생
		list2.add("손흥민");
		
		String str5=list2.get(0);
		String str6=list2.get(1);
		
		System.out.println(str5);
		System.out.println(str6);

		
		
	}
	
}

class User{
	String name;
	int age;
}

class Member{
	int id;
	String name;
}
