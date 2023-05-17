/* package codechef; // don't place package name! */

import java.text.DecimalFormat;
import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void DecitoBin(int Deci)
	{
		int MyDeci = Deci;
		int pow = 0;
		int rem;
		int Bin = 0;

		while(Deci>0)
		{
			rem = Deci%2;
			Bin = Bin + (rem * (int)Math.pow(10, pow));

			pow++;
			Deci = Deci/2;

		}
		System.out.println("Decimal of " + MyDeci + " is "+ Bin);
	}
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		do{
			System.out.println("Enter Your Decimal number: ");
		    int Deci = timtim.nextInt();
			// BintoDeci(Bin);
			DecitoBin(Deci);
		    
		}while(--T>0);
		

		
	}
}
