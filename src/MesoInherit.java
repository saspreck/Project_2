public class MesoInherit extends MesoAbstract {
	
	//declares the private variable StID
	private String StID;
	
	//creates the constructor for the MesoInherit object
	public MesoInherit(MesoStation StID) {
		this.StID = StID.getStID();
	}
	
	//declares the int array to store the ASCII values
	private int[] ASCIIvalues;
	
	//implementation of the calAverage method inherited from the MesoAbstract class
	public int[] calAverage() {
		ASCIIvalues = new int[3];
		int total = 0;
		//iterates through StID and adds the ASCII values
		for(int i = 0; i < 4; i++) {
			total += StID.charAt(i);
		}
		//calculates the average value and puts it into the array
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