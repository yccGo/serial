package cn.edu.cust.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1,"Tom",25);
		Person p2 = new Person(2,"Allen",22);
		Person p3 = new Person(3,"Kobe",28);
		Person p4 = new Person(4,"James",18);
		Person p5 = new Person(5,"Curry",18);
		List<Person> ps = new ArrayList<Person>();
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		ps.add(p4);
		ps.add(p5);
		Collections.sort(ps);
		for(Person person : ps){
			System.out.println(person);
		}
		ps.add(new Person(6,"Yao",29));
		Collections.sort(ps, new PersonComparator());
		System.out.println("------------");
		for(Person person : ps){
			System.out.println(person);
		}
	}

}
