package cn.edu.cust.test;

public class Test implements Runnable {
	int num = 1000;
	int count = 0;
	@SuppressWarnings("all")
	public void Test(){
		System.out.println("test");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + " 抢到  " + num);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				num--;
				count++;
			} else {
				System.out.println("count：" + count);
				break;
			}
		}
		// while(true){
		// }
	}

	public static void main(String[] args) throws InterruptedException {
		Test test1 = new Test();
		Thread t1 = new Thread(test1, "老大");
		Thread t2 = new Thread(test1, "老二");
		Thread t3 = new Thread(test1, "小明");
		test1.Test();
		// t1.setPriority(Thread.MIN_PRIORITY);
		// t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		// Thread.sleep(200);
	}
}
