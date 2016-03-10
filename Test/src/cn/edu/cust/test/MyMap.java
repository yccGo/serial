package cn.edu.cust.test;

import java.util.Iterator;
import java.util.LinkedList;

public class MyMap {
	private int size = 0;
	private LinkedList[] array = new LinkedList[1000];

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int hash(Object key) {
		return key.hashCode() % array.length;
	}

	public void put(Object key, Object value) {
		int hash = hash(key);
		if (array[hash] == null) {
			array[hash] = new LinkedList();
			array[hash].push(new Entry(key, value));
			size++;
		} else {
			Iterator it = array[hash].iterator();
			while (it.hasNext()) {
				Entry entry = (Entry) it.next();
				if (entry.key.equals(key)) {
					entry.value = value;
					return;
				}
			}
			array[hash].push(new Entry(key, value));
			size++;
		}
	}

	public Object get(Object key) {
		int hash = hash(key);
		if (array[hash] != null) {
			Iterator it = array[hash].iterator();
			while (it.hasNext()) {
				Entry entry = (Entry) it.next();
				if (entry.key.equals(key)) {
					return entry.value;
				}
			}
		}
		return null;
	}

	public boolean containsKey(Object key) {
		for (LinkedList list : array) {
			if (list != null) {
				Iterator it = list.iterator();
				while (it.hasNext()) {
					if (((Entry) it.next()).getValue().equals(key)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean containsValue(Object value) {
		for (LinkedList list : array) {
			if (list != null) {
				Iterator it = list.iterator();
				while (it.hasNext()) {
					if (((Entry) it.next()).getValue().equals(value)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		MyMap map = new MyMap();
		map.put("ÁõâıÍş", "ÑîÃİ");
		map.put("ÎâÆæÂ¡", "ÁõÊ«Ê«");
		map.put("µË³¬", "ËïÙ³");
		map.put("µË³¬", "¹ÅÁ¦ÄÈÔú");
		System.out.println(map.get("ÁõâıÍş"));
		System.out.println(map.get("µË³¬"));
		System.out.println(map.size());
	}
}

class Entry {
	public Entry() {
	}

	public Entry(Object key, Object value) {
		this.key = key;
		this.value = value;
	}

	public Object key;
	public Object value;

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}