/* package codechef; // don't place package name! */

import java.text.DecimalFormat;
import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void BintoDeci(int Bin)
	{
		int pow = 0;
		int Deci = 0;
		int BinNum = Bin;
		while(Bin>0)
		{
			int lastdigit  = Bin%10;
			Deci = Deci + (lastdigit * (int)Math.pow(2, pow));
			pow++;
			Bin /= 10;
		}
		System.out.println("Decimal of " + BinNum + " is "+ Deci);
  }
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		do{
			System.out.println("Enter Your Binary number: ");
		    int Deci = timtim.nextInt();
			// BintoDeci(Bin);
			DecitoBin(Deci);
		    
		}while(--T>0);
		

		
	}
}
