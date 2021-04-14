import java.util.Scanner;
import java.util.*;
import java.io.*;

public class changeMachineRunner 
{
	static Scanner file = new Scanner("currency.txt");
	static Scanner userInput = new Scanner(System.in);
	static int[] currency = new int[8];
	static int purchase = 0;
	static int payment = 0;
	static int change = 0;
	static int choice;

	public static void main(String[] args) throws IOException
	{
		
		chooseCurrency();
		System.out.println(" ");
		getMoney();
		System.out.println(" ");
		giveChange();
				
	}
	
	public static void chooseCurrency()
	{
		System.out.println("Welcome to the Drool-Proof Change Machine!");
		System.out.println("Which currency type would you like to use?");
		System.out.println("1. US");
		System.out.println("2. Prime");
		System.out.println("3. Binary");
		System.out.println("4. Base-3");
		choice = userInput.nextInt();
	}
	
	public static void getMoney()
	{
		System.out.println("How much money is your purchase worth? (Don't include decimals.)");
		purchase = userInput.nextInt();
		System.out.println("How much money did you give the clerk?");
		payment = userInput.nextInt();
		change = (purchase - payment) * -1;
	}
	
	public static void giveChange()
	{
		//US
		if(choice == 1)
		{	
			int[] currency = {1, 5, 10, 25, 50, 100, 500, 1000};
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN (Please note that this is listed greatest to least.)");
			
			for(int i = 7; i >= 0; i--)
			{
				System.out.print(currency[i] + ": ");
				
				if(change < currency[i])
				{
					System.out.println("0");
				}
				
				else
				{
					int iterations = change/currency[i];
					System.out.println(iterations);
					change = change - (currency[i] * iterations);
				}
			}
		}

		//Prime
		else if(choice == 2)
		{	
			int[] currency = {1, 2, 3, 5, 7, 11, 13, 17};
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN (Please note this is listed greatest to least.)");
			
			for(int i = 7; i >= 0; i--)
			{
				System.out.print(currency[i] + ": ");
				
				if(change < currency[i])
				{
					System.out.println("0");
				}
				
				else
				{
					int iterations = change/currency[i];
					System.out.println(iterations);
					change = change - (currency[i] * iterations);
				}
			}
		}
		
		//Binary
		else if(choice == 3)
		{	
			int[] currency = {1, 2, 4, 8, 16, 32, 64, 128};
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN (Please note this is listed greatest to least.)");
			
			for(int i = 7; i >= 0; i--)
			{
				System.out.print(currency[i] + ": ");
				
				if(change < currency[i])
				{
					System.out.println("0");
				}
				
				else
				{
					int iterations = change/currency[i];
					System.out.println(iterations);
					change = change - (currency[i] * iterations);
				}
			}
		}
		
		//Base-3
		else if(choice == 4)
		{	
			int[] currency = {1, 3, 9, 27, 81, 243, 729, 2187};
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN (Please note this is listed greatest to least.)");
			
			for(int i = 7; i >= 0; i--)
			{
				System.out.print(currency[i] + ": ");
				
				if(change < currency[i])
				{
					System.out.println("0");
				}
				
				else
				{
					int iterations = change/currency[i];
					System.out.println(iterations);
					change = change - (currency[i] * iterations);
				}
			}
		}
		
		else
		{
			System.out.println("Unfortunately, our store does not carry your kind of currency.");
			System.out.println("We will not be able to proceed with the transaction.");
			System.out.println("We apologize for the inconvenience. Have a nice day!");
		}

	}
	
	

}
