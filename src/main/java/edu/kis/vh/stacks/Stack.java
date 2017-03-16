package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {
	
	private IStackImplMethod items;

	public Stack() {
		super();
		this.items = new StackList();
	}
	
	public Stack(IStackImplMethod items) {
		super();
		this.items = items;
	}

	public void push(int i) {
		items.push(i);
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public boolean isFull() {
		return items.isFull();
	}

	public int top() {
		return items.top();
	}

	public int pop() {
		return items.pop();
	}

	public int getTotal() {
		return items.getTotal();
	}

}
// opcja Navigate -> Open Declaration przenosi widok do deklaracji zaznaczonej metody
