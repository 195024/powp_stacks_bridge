package edu.kis.vh.stacks.list;

class Node {

	private int value; // w związku z hermetyzacją, w klasie StackList dostęp do 
						// tego pola jest poprzez getter, a nie bezpośrednio
	private Node prev;
	private Node next;

	Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

}
