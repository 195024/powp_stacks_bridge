package edu.kis.vh.stacks;

public interface IStackImplMethod {

	public int EMPTY_STACK_INDICATOR = 0; //dzięki temu, że zmienna została wyciągnięta do wspólnego interfejsu
											//to zamiana wartości jest bardzo łatwa
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}