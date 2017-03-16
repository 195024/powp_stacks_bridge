package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int SIZE = 12;

	private final int[] items = new int[SIZE];

	private int total = EMPTY_STACK_INDICATOR;
	
	private StackList stackList;

	public Stack() {
		super();
		this.stackList = new StackList();
	}
	
	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}

	public int getTotal() {
		return stackList.getTotal();
	}

}
// opcja Navigate -> Open Declaration przenosi widok do deklaracji zaznaczonej metody
