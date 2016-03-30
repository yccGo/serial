package cn.edu.cust.dynamic;

public class RealStar implements Star {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sing() {
		System.out.println(this.name + " 开始唱歌");
	}

	@Override
	public void bookTicket() {
		System.out.println(this.name + " 开始订票");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public RealStar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
