import java.util.Scanner;
import java.util.*;
import java.io.*;

public class changeMachineRunner 
{

	public static void main(String[] args) throws IOException
	{
		File in = new File("currency.txt");
		Scanner file = new Scanner(in);
		Scanner userInput = new Scanner(System.in);
		int purchase = 0;
		int payment = 0;
		int change = 0;

		//Choosing currency type
		System.out.println("Welcome to the Drool-Proof Change Machine!");
		System.out.println("Which currency type would you like to use?");
		System.out.println("1. US");
		System.out.println("2. Prime");
		System.out.println("3. Binary");
		System.out.println("4. Base-3");
		int choice = userInput.nextInt();
		System.out.println(" ");
		//Getting transaction info from user
		System.out.println("How much money is your purchase worth? (Don't include decimals.)");
		purchase = userInput.nextInt();
		System.out.println("How much money did you give me?");
		payment = userInput.nextInt();
		change = (purchase - payment) * -1;
		
		//US System
		if(choice == 1)
		{	
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN");
//			for(int i = 0; i < 8; i++)
//			{
//				System.out.println(file.nextInt());
//			}
		}

		//Prime
		else if(choice == 2)
		{	
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN");
		}
		
		//Binary
		else if(choice == 3)
		{	
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN");
		}
		
		//Base-3
		else if(choice == 1)
		{	
			System.out.println(" ");
			System.out.println("TRANSACTION SUMMARY");
			System.out.println("Purchase Price: " + purchase);
			System.out.println("Payment: " + payment);
			System.out.println("Change Owed: " + change);
			System.out.println("BREAKDOWN");
		}
		
		else
		{
			System.out.println("Unfortunately, our store does not carry your kind of currency.");
			System.out.println("We will not be able to proceed with the transaction.");
			System.out.println("We apologize for the inconvenience. Have a nice day!");
		}
		
	}

}
