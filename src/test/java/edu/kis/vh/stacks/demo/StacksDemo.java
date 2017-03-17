package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.StackArraysFactory;
import edu.kis.vh.stacks.factory.StackListsFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		System.out.println("DefaultStacksFactory");
		Stack[] stacks = testStacks(defaultStacksFactory);
		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
		System.out.println();
		
		StackListsFactory stackListsFactory = new StackListsFactory();
		System.out.println("StackListsFactory");
		Stack[] stackLists = testStacks(stackListsFactory);
		System.out.println("total rejected is " + ((StackHanoi) stackLists[3]).reportRejected());
		System.out.println();
		
		StackArraysFactory stackArraysFactory = new StackArraysFactory();
		System.out.println("StackArraysFactory");
		Stack[] stackArrays = testStacks(stackArraysFactory);
		System.out.println("total rejected is " + ((StackHanoi) stackArrays[3]).reportRejected());
	}

	private static Stack[] testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
		return stacks;
	}

}

// stack.java
// wiersze: 11, 14-32
// StackFIFO.java
// wiersze: 10, 11, 12, 14, 16, 17, 18
// StackHanoi.java
// wiersze: 5, 8, 12, 13
// IstacksFactory.java
// wiersze: 7-17
// StacksDemo.java
// wiersze: 19-27