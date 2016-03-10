package cn.edu.cust.test;

public class Test11 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Eater());
		Thread t2 = new Thread(new Player());
		t1.start();
		t2.start();
	}
}
