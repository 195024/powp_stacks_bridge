package edu.kis.vh.stacks.list;

public class StackList {
	private class Node {

		private final int value; // w związku z hermetyzacją, w klasie StackList dostęp do 
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
	
	private static final int EMPTY_STACK_INDICATOR = -1;
	private Node last;
	int i;
	private int total = EMPTY_STACK_INDICATOR;
	
	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	public int getTotal() {
		return total;
	}
	
	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peek() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}

}
