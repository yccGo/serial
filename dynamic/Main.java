package cn.edu.cust.dynamic;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		RealStar realStar = new RealStar("Tom", 23);
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Star.class }, handler);//代理类对象，传系统默认的类加载器，接口集合以及控制器
		//调用的方法都会去handler中报到
		proxy.sing();
		proxy.bookTicket();
	}
}
