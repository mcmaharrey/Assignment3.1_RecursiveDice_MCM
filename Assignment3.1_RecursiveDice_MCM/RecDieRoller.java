import java.util.Random;
/**
 * This code will use a recursive method to roll a simulated die until it rolls a 2
 * @author Matt
 *
 */
public class RecDieRoller {
	
	private Random random = new Random();
	
	/**
	 * This will roll a die until it rolls a number 2 
	 * @return roll starts with a total of 0 rolls
	 */
	public int roll() {
		
		return roll(0);
	}
	
	/**
	 * This will roll a simulated die until the number 2 is rolled
	 * @param rolls is the number of rolls so far in the program
	 * @return the number of total rolls to roll a number 2
	 */
	public int roll(int rolls) {
		
		 int rollResult = random.nextInt(6) + 1;
		 rolls++;
		 System.out.println("Rolled a " + rollResult);
		 if (rollResult == 2) {
	            System.out.println("Stop a 2 was rolled");
	            return rolls;
	        }
		 return roll(rolls);
	}
	
}//end class
