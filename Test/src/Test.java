import java.util.Enumeration;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("hello");
		vector.add("world");
		Enumeration<String> strs = vector.elements();
		while(strs.hasMoreElements()){
			System.out.println(strs.nextElement());
		}
	}
}
