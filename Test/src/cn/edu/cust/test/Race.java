package cn.edu.cust.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Race implements Callable<Integer> {
	long relay = 1000;
	public boolean flag = true;
	int size = 1000;
	int step = 0;
	String name;
	public Race(){
		
	}
	public Race(String name,long relay){
		this.name = name;
		this.relay = relay;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		while(flag){
			Thread.sleep(relay);
			step++;
		}
		return step;
	}

	public static void main(String[] args) {
		Race race1= new Race("兔子",1000);
		Race race2= new Race("乌龟",1800);
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> result1 = service.submit(race1);
		Future<Integer> result2 = service.submit(race2);
		try {
			Thread.sleep(5000);
			race1.flag = false;
			race2.flag = false;
			// 等待计算完成，获取结果
			int returnVal1 = result1.get();
			int returnVal2 = result2.get();
			System.out.println(race1.name + "  " +  returnVal1);
			System.out.println(race2.name + "  "  + returnVal2);
			service.shutdownNow();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
