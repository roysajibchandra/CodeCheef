/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		while(T-->0)
		{
		    BigInteger N = timtim.nextBigInteger();
		    BigInteger P = new BigInteger("20");
		    BigInteger S = N.remainder(P);
		    
		    System.out.println(S);
		}
	}
}
