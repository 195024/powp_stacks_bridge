package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.IStackImplMethod;

public class StackArray implements IStackImplMethod {

	private static final int SIZE = 12;

	private final int[] items = new int[SIZE];

	private int total = IStackImplMethod.EMPTY_STACK_INDICATOR;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == IStackImplMethod.EMPTY_STACK_INDICATOR;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == (SIZE - 1);
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return IStackImplMethod.EMPTY_STACK_INDICATOR;
		return items[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return IStackImplMethod.EMPTY_STACK_INDICATOR;
		return items[total--];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

}
