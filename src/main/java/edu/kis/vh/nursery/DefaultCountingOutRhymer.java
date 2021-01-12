package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INT = -1;
	public static final int TABSIZE = 12;
	private int[] numbers = new int[TABSIZE];

	public int total = INT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}

	public boolean isFull() {
			return total == 11;
		}

	protected int playPeekaboo() {
		if (callCheck())
			return INT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return numbers[total--];
	}

}
//random comment 2