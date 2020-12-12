package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//zle sformatowane wiersze: 5, 12, 14, 15, 16

//Klawisze alt + ← oraz alt + → przełączają aktualnie edytowane pliki w oknie (w intelliJ)