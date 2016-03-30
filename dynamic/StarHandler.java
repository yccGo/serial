package cn.edu.cust.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	public RealStar realStar;

	public StarHandler(RealStar realStar) {
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Thread.sleep(1000);
		System.out.println(method.getName() + "----------方法执行之前----------");
		if(method.getName().equals("sing")){
			System.out.println("要执行唱歌方法");
		}else if(method.getName().equals("bookTicket")){
			System.out.println("要执行订票方法");
		}
		method.invoke(realStar, args);//调用哪个对象的方法，使用哪些参数
		Thread.sleep(1000);
		System.out.println(method.getName() + "----------方法执行之后----------");
		return null;
	}

}
