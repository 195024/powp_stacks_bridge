package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;

public class StackFIFO extends Stack {

	private final StackArray temp = new StackArray();

	public StackFIFO() {
		super();
	}

	public StackFIFO(IStackImplMethod items) {
		super(items);
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		int ret = temp.pop();
		while (!temp.isEmpty())
			push(temp.pop());
		return ret;
	}
}

// Lab2 3.1.14
// Lepszym wyborem będzie StackArray, gdyż operacje pop i push są mniej kosztowne