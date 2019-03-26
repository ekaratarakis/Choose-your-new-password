package choosepin;
import java.util.Random;
//import java.util.Arrays;

/**
 * This is the RandomGenerator class of the RandomGenerator application.
 * @author ekaratarakis
 * @version 1.0
 */
public class RandomGenerator 
{
	/**
	 * This is the method generateCode() for generating the random string secrete number.
	 * @param upperRange - The range for choosing random numbers (0 - 10).
	 * @param numOfDigits - This is the number of digits of the secret number.
	 * @return buffer - Returns the buffer with the random string secrete number with numbers and letters.
	 */
	public StringBuilder generateCode(int upperRange, int numOfDigits)
	{
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(numOfDigits); 
		for(int i = 0; i<numOfDigits; i++)
		{
			if(i % 2 == 0)
			{
				String num = String.valueOf(random.nextInt(upperRange));
				buffer.append(num);
			}
			else
			{
				int randomLimitedInt = 97 + (int)(random.nextFloat() * (122 - 97 + 1));
				buffer.append((char) randomLimitedInt);
			}
		}
		System.out.println("The random password is : " + buffer.toString());
		System.out.println("Satisfied with your password?\nNo  - click 1 to rerun the application.\nYes - click 0 to close the application.");
		return buffer;
	}
	
	/**
	 * This is a simple method for printing introduction info.
	 * This printing method printInfo is void since it olny prints info.
	 */
	public void printIntro()
	{
		System.out.println("Hello! Welcome to this application of generating your new pin.");
		System.out.println("Please follow the steps and generate your new secrete pin.\n");
	}

}
