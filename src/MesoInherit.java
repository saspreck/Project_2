public class MesoInherit extends MesoAbstract {
	
	private String StID;
	
	public MesoInherit(MesoStation StID) {
		this.StID = StID.getStID();
	}
	
	private int[] ASCIIvalues;
	
	public int[] calAverage() {
		ASCIIvalues = new int[3];
		int total = 0;
		for(int i = 0; i < 4; i++) {
			total += StID.charAt(i);
		}
		int average = total / 4;
		ASCIIvalues[2] = average;
		
		ASCIIvalues[0] = (int) Math.ceil(average);
		ASCIIvalues[1] = (int) Math.floor(average);
		
		return ASCIIvalues;
	}
	
	public char letterAverage() {
		return (char) ASCIIvalues[2];
	}
}