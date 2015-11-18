
public class Game {

	public static void main(String[] args) {
		
		int sidesTimesSix = 2; // enter 1 then sides = 6
		int trials = 5; // number of rolls
		
		Dice dice = new Dice (sidesTimesSix, trials);
		
		for (int i = 0; i < trials; i++)
		{
			dice.getRoll();
			dice.playGame();
		}
		
		dice.displayTrials();
		
		dice.gameHistory();

	}

}
