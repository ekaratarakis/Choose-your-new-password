package choosepin;

import java.util.Scanner;

/**
 * This is an application for generating a random code with numbers and lowercase letters. 
 * @author ekaratarakis
 * @version 1.0
 */
public class Main 
{
	/**
	 * This is the main method of the RandomGenerator application.
	 * @param args
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice, ans = 0, digits = 0;
		RandomGenerator rg = new RandomGenerator();
		do
		{
			rg.printIntro();
			System.out.println("Do you want to create a random number? (1 == Yes or Anything else == No)");
			ans = scan.nextInt();
			System.out.println("How many digits do you want to have in your secret pin code?");
			digits = scan.nextInt();
			if(ans == 1)
			{
				rg.generateCode(10, digits);
			}
			else
			{
				System.out.println("Please run the application again when you like. Thank you!");
				break;
			}
			choice = scan.nextInt();
		}while(choice!=0);
		System.out.println("Thank you for using the RandomGenerator application. Until next time, take care!");
		scan.close();
	}	
}
