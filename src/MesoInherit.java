public class MesoInherit extends MesoAbstract {
	
	//declares the private variable StID
	private String StID;
	
	//creates the constructor for the MesoInherit object
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
		double average = total / 4.0;
		ASCIIvalues[2] = (int) average;
		
		ASCIIvalues[0] = (int) Math.ceil(average);
		ASCIIvalues[1] = (int) Math.floor(average);
		
		return ASCIIvalues;
	}
	
	public char letterAverage() {
		return (char) ASCIIvalues[2];
	}
}