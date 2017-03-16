package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStackImplMethod;

public class StackArray implements IStackImplMethod {

	private static final int EMPTY_STACK_INDICATOR = -1;

	private static final int SIZE = 12;

	private final int[] items = new int[SIZE];

	private int total = EMPTY_STACK_INDICATOR;

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
		return total == EMPTY_STACK_INDICATOR;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return items[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackImplMethod#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
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
