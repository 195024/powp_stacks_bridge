package edu.kis.vh.stacks;

public interface IStackImplMethod {

	public int EMPTY_STACK_INDICATOR = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}