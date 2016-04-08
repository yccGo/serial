package cn.edu.cust.innerClass;

public class OuterClass {
	public static int num = 123;
	public String str = "hello world";

	public void show() {
		System.out.println("OuterClass show()");
	}
	
	public static void hello() {
		System.out.println("hello");
	}

	public static class InnerClass {
		// 静态内部类中既可以有静态成员，也可以有非静态成员
		public static int num2 = 345;
		public String str2 = "I LOVE U";

		public void show2() {
			System.out.println(num);//调用外部类的静态属性
			// System.out.println(str); //不能调用外部类的非静态成员
		}

		public static void hello2() {
			System.out.println("hello2");//调用外部类的静态方法
			hello();
		}
	}
	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass.InnerClass();//声明
		inner.hello2();
		inner.show2();
		InnerClass inner2 = new InnerClass();//可独立声明
		inner2.hello2();
		
	}
}
