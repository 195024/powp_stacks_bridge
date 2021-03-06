package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.IStackImplMethod;

public class StackList implements IStackImplMethod {
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
	
	private Node last;
	private int total = IStackImplMethod.EMPTY_STACK_INDICATOR;
	
	public void push(int i) {
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

	public int top() {
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
