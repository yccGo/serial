package cn.edu.cust.compare;

public class Person implements Comparable<Person>{
	public int id;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String name;
	public int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public int compareTo(Person person) {
		if(this.age > person.age){
			return -1;
		}else if(this.age < person.age){
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
	
}
