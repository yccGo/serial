
public class Test6 {
	public static void main(String[] args) {
		Test6 test = new Test6();
		System.out.println(test.hashCode() % 1000);
		Test6 test2 = new Test6();
		System.out.println(test2.hashCode() % 1000);
		Test6 test3 = new Test6();
		System.out.println(test3.hashCode() % 1000);
		String str1 = "aaa";
		String str2 = "bbb";
		String str3 = "aaa";
		String str4 = new String("aaa");
		System.out.println("-------------");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		int a = 111;
		Integer i1 = new Integer(111);
		Integer i2 = new Integer(222);
		Integer i3 = new Integer(333);
		Integer i4 = new Integer(111);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		System.out.println(i4.hashCode());
		int i5 = 4;
		i5 ^= 2;
		System.out.println(i5);
	}
}
