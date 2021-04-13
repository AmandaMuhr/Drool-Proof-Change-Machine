import java.util.Scanner;
import java.util.*;
import java.io.*;

public class changeMachineRunner 
{

	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("currency.txt"));
		Scanner userInput = new Scanner(System.in);
		int purchase = 0;
		int payment = 0;
		int change = 0;

		//Getting info from user
		System.out.println("Welcome to the Drool-Proof Change Machine!");
		System.out.println(" ");
		System.out.println("How much money is your purchase worth? (Don't include decimals.)");
		purchase = userInput.nextInt();
		System.out.println("How much money did you give me?");
		payment = userInput.nextInt();
		//Math below isn't quite right, but it's the general technique
		change = (purchase - payment) * -1;
		
		System.out.println(" ");
		System.out.println("COMMERCE SUMMARY");
		System.out.println("Purchase Price: " + purchase);
		System.out.println("Payment: " + payment);
		System.out.println("Change Owed: " + change);
		System.out.println("BREAKDOWN");
		
	}

}
