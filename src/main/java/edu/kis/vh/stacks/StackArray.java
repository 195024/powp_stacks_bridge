package edu.kis.vh.stacks;

public class StackArray {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int SIZE = 12;

	private final int[] items = new int[SIZE];

	private int total = EMPTY_STACK_INDICATOR;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total--];
	}

	public int getTotal() {
		return total;
	}

}
