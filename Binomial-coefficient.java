/* package codechef; // don't place package name! */
//  use function

import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int fact(int N, int R)
	{
		int factN = 1;
		int factR = 1;
		int factNR = 1;
		for(int i=1; i<=N; i++)
		{
			factN *= i;
		}
		for(int j=1; j<=R; j++)
		{
			factR *= j;
		}
		for(int k=1; k<=(N-R); k++)
		{
			factNR *= k;
		}

		int binomial = factN / (factR * factNR);
		return binomial;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner timtim  = new Scanner(System.in);
		int T = timtim.nextInt();
		
		while(T-->0)
		{
			int N = timtim.nextInt();
			int R = timtim.nextInt();
			int res = fact(N, R);
			System.out.println(res);
		}
		
	}
}
