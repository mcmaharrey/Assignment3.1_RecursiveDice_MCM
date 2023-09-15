/**
 * This program will roll a simulated die and record the result of each roll
 * @author Matt
 *
 */
public class RecDieRollerDriver {

	/**
	 * This is the main method that will run and calculate the mean number of rolls for the die
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		RecDieRoller Die = new RecDieRoller();
		
		//Die.roll(); This code will run the orgional die roll for part 1 of the assignment 
		
		RecDieRoller Die2 = new RecDieRoller();
		
		int totalRolls = 0;
		int numRolls = 1000;
		
		
		for (int i = 0; i < numRolls; i++) {
			totalRolls += Die2.roll();
		}
		
		double meanRolls = totalRolls / numRolls;
		System.out.println("The mean number of rolls to get 2 = " + meanRolls);
		
	    }//end main
		
	}//end class


