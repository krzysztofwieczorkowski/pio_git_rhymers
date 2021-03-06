package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	public int total = -1;
	public int DEFAULT_VALUE = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total--];
	}

}
