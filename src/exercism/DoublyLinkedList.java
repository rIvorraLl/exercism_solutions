package exercism;

import java.util.ArrayList;

class DoublyLinkedList<T> {
    private Element<T> head;
    ArrayList<Element> list = new ArrayList<Element>();

    void push(T value) {
	head = new Element<T>(value, null, null);
	if (!list.isEmpty() && list.get(0) != null) {
//	    System.out.println("entering... " + value);
//	    System.out.println("value=" + list.get(list.size() - 1).value);
	    head = new Element<T>(value, list.get(list.size() - 1), null);
	    list.add(head);
	} else {
	    list.add(head);
	}
    }

    T pop() {
	throw new UnsupportedOperationException(
		"Please implement the DoublyLinkedList.pop() method.");
    }

    void unshift(T value) {
	throw new UnsupportedOperationException(
		"Please implement the DoublyLinkedList.unshift() method.");
    }

    T shift() {
	throw new UnsupportedOperationException(
		"Please implement the DoublyLinkedList.shift() method.");
    }

    private static final class Element<T> {
	private final T value;
	private Element<T> prev;
	private Element<T> next;

	Element(T value, Element<T> prev, Element<T> next) {
	    this.value = value;
	    this.prev = prev;
	    this.next = next;
	}
    }

    public static void main(String[] args) {
	DoublyLinkedList<String> dl = new DoublyLinkedList<String>();
	dl.push("patata");
	dl.push("boniato");
	dl.push("membrillo");
	for (Element str : dl.list) {
	    if (str.prev != null) {
		System.out.println("val=" + str.value);
		System.out.println("prev=" + str.prev.value);
		// System.out.println("next=" + str.next.value);
	    }
	}
    }
}
