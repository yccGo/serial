import java.util.LinkedList;

public class MyLinkedList {
	private Node head;
	int size = 0;

	public void push(Object value) {
		Node node = new Node();
		node.value = value;
		if (size != 1 && size != 0) {
			head.previous.next = node;// 尾节点后记指针指向新增节点
			node.previous = head.previous;// 新增节点前驱指针指向尾节点
			node.next = head;
			head.previous = node;
		} else if (size == 0) {
			node.next = node;
			node.previous = node;
		} else {
			node.next = head;
			node.previous = head;
			head.next = node;
			head.previous = node;
		}
		head = node;
		size++;
	}

	public void add(Object value) {
		Node node = new Node();
		node.value = value;
		if (size != 1 && size != 0) {
			head.previous.next = node;// 尾节点后记指针指向新增节点
			node.previous = head.previous;// 新增节点前驱指针指向尾节点
			node.next = head;
			head.previous = node;
		} else if (size == 0) {
			node.next = node;
			node.previous = node;
		} else {
			node.next = head;
			node.previous = head;
			head.next = node;
			head.previous = node;
		}
		head = node;
		size++;
	}

	public static void main(String[] args) {

	}
}

class Node {
	public Node next;
	public Node previous;
	public Object value;
}