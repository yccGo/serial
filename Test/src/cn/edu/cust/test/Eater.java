package cn.edu.cust.test;

public class Eater implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i < 100;i++){
			System.out.println("eat -----> " + i );
		}
	} 

}
