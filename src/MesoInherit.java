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
		//calculates the average value
		double average = total / 4.0;
		
		//puts the floor and ceiling values into the array
		ASCIIvalues[0] = (int) Math.ceil(average);
		ASCIIvalues[1] = (int) Math.floor(average);
		
		//checks if the average should round down or up
		if ((int) (average + 0.5) == (int) average) {
			ASCIIvalues[2] = ASCIIvalues[1];
		}
		else {
			ASCIIvalues[2] = ASCIIvalues[0];
		}
		
		// returns the array
		return ASCIIvalues;
	}
	
	//implementation of letterAverage method inherited from MesoAbstract class
	public char letterAverage() {
		
		//returns the ASCII character equals to the average value
		return (char) ASCIIvalues[2];
	}
}