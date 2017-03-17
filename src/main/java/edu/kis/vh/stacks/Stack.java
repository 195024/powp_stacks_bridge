package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

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
// zamiana w punkcie 3.1.6 pozwala na łatwe dobranie implementacji stosu, albo tablica albo lista, zaleta polimorfizmu

// po wykorzystaniu interfejsu w powyższej klasie, funkcja Navigate -> Open Declaration przenosi widok do deklaracji metody w interfejsie
// Navigate -> Quick Type Hierarchy (ctrl+t) wyświetla podręczne okienko z typami implementującymi lub definującymi zaznaczoną wywoływaną metodą
// przytrzymanie przycisku Ctrl na zaznaczonym wywołaniu metody wyświetla małe okienko pozwalające albo przejść do deklaracji metody (F3), albo
// wyświetlić Quick Type Hierarchy (ctrl+t)
