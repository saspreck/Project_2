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
		
		//puts the floor and ceiling values into the array
		ASCIIvalues[0] = (int) Math.ceil(average);
		ASCIIvalues[1] = (int) Math.floor(average);
		
		// returns the array
		return ASCIIvalues;
	}
	
	//implementation of letterAverage method inherited from MesoAbstract class
	public char letterAverage() {
		
		//returns the ASCII character equals to the average value
		return (char) ASCIIvalues[2];
	}
}