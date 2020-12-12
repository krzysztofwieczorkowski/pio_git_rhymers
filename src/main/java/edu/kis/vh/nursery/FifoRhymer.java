package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int returnValue = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return returnValue;
	}

}
