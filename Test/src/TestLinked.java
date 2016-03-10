import java.util.Iterator;
import java.util.LinkedList;

public class TestLinked {
	public static void showList(LinkedList<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("hello");
		list.add("world");
		list.add("ycc");
		showList(list);
		System.out.println("size : " + list.size());
		System.out.println("list.get(2) : " + list.get(2));
		list.push("ok");
		list.push("no");
		showList(list);
		list.removeFirst();
		showList(list);
		list.removeLast();
		showList(list);
		System.out.println(list.element());
		list.set(1, "www");
		showList(list);
		System.out.println(list.indexOf("www"));
		System.out.println(list.indexOf("bbb") );
		list.add("ok");
		showList(list);
		list.push("what");
		showList(list);
	}
}
