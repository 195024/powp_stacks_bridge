package edu.kis.vh.stacks;

/**
 * Stos typu 'wieża Hanoi', na którym nie jest możliwe położenie
 * liczby większej niż obecna na wierzchu stosu.
 * 
 */
public class StackHanoi extends Stack {
	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}

	public StackHanoi(IStackImplMethod items) {
		super(items);
	}

	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Kładzie element wejściowy na stosie wykorzystując metodę z klasy bazowej.
	 * Jeśli element nie spełnia warunku wieży Hanoi, to zostaje odrzucony.
	 * @param in element, który ma być dołożony na stos
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
