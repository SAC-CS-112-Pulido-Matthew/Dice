import java.util.Scanner;
public class Dice {
	private int number;
	private int trials;
	public int diceNumber;
	public int oddRoll = 0;
	public int evenRoll = 0;
	public int wins = 0;
	
	public Dice (int sides, int rolls)
	{
		number = sides;
		trials = rolls;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int newValue)
	{
		number = newValue;
	}
	
	public int getTrials()
	{
		return trials;
	}
	
	public void setTrials(int newValue)
	{
		trials = newValue;
	}
	
	public int getRoll()
	{
		int range = (number *(6 - 1)) + 1;     
		return diceNumber = (int)(Math.random() * range) + 1;
	}
	
	public void playGame()
	{
		Scanner input = new Scanner (System.in);
		String guess;
		char guessChar;
		
		System.out.printf("You rolled a dice. Did the dice land on an odd or even number? 'O' for odd 'E' for even: ");
		guess = input.next();
		guessChar = guess.charAt(0);
		guessChar = Character.toUpperCase(guessChar);
		
		switch(guessChar)
		{
			case 'O':
			{
				if (diceNumber % 2 == 0)
				{
					System.out.println("You guessed odd and the roll was even. Fail.");
				}
				else if (diceNumber % 2 == 1)
				{
					System.out.println("You guessed odd and the roll was odd. Win.");
					wins++;
					oddRoll++;
				}
				break;
			}
			case 'E':
			{
				if (diceNumber % 2 == 0)
				{
					System.out.println("You guessed even and the roll was even. Win.");
					wins++;
					evenRoll++;
				}
				else if (diceNumber % 2 == 1)
				{
					System.out.println("You guessed even and the roll was odd. Fail.");
					evenRoll++;
					oddRoll++;
				}
				break;
			}
		}
	}
	
	public void gameHistory()
	{
		float percentOddRoll = (((float)oddRoll) / ((float)trials) * (100));
		float percentEven = (((float)evenRoll)/((float)trials)) * (100);
		float percentWin = (((float)wins)/((float)trials)) * (100);
		System.out.printf("You played this game %d times!", trials);
		System.out.printf("\nYou win %f percent of the time.", percentWin);
		System.out.printf("\nYou select even %f percent of the time.", percentEven);
		System.out.printf("\nYou roll an odd number %f percent of the time.", percentOddRoll);
	}
	
	public void displayTrials()
	{
		System.out.printf("You rolled the dice %d times.\n", trials );
	}

}
