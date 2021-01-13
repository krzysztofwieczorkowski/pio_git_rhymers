package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int rejectReport() {
		return getTotalRejected();
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > playPeekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
//zle sformatowane wiersze: 5, 12, 14, 15, 16

//Klawisze alt + ← oraz alt + → przełączają aktualnie edytowane pliki w oknie (w intelliJ)