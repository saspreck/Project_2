public class MesoInherit extends MesoAbstract {
	
	private String StID;
	
	public MesoInherit(MesoStation StID) {
		this.StID = StID.getStID();
	}
	
	public int[] calAverage() {
		int[] ASCIIvalues = new int[4];
		int total = 0;
		for(int i = 0; i < 4; i++) {
			total += StID.charAt(i);
		}
		ASCIIvalues[2] = total / 4.0;
	}
}