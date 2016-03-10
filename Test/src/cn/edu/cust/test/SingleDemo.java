package cn.edu.cust.test;

public class SingleDemo {
	private static SingleDemo instance = null;

	private SingleDemo() {
	}

	public static SingleDemo newInstance() {
		if (instance == null) {
			synchronized (SingleDemo.class) {
				if (instance == null) {
					instance = new SingleDemo();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		SingleDemo sd1 = SingleDemo.newInstance();
		SingleDemo sd2 = SingleDemo.newInstance();
		System.out.println(sd1);
		System.out.println(sd2);
	}
}
