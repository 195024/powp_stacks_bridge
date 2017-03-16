package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int SIZE = 12;

	private final int[] items = new int[SIZE];

	private int total = EMPTY_STACK_INDICATOR;
	
	private StackArray stackArray;

	public Stack() {
		super();
		this.stackArray = new StackArray();
	}
	
	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}

}
// opcja Navigate -> Open Declaration przenosi widok do deklaracji zaznaczonej metody
