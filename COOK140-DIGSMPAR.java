/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
		    int N = timtim.nextInt();
		    int M = N;
		    
		    int Nine=0;
		    while(N%10==9)
		    {
		        Nine++;
		        N/=10;
		    }
		  //  if(Nine%2==1)
		  //  {
		  //      System.out.println(M+2);
		  //  }
		  //  else
		  //  {
		  //      System.out.println(M+1);
		  //  }
		  
		  //short
		  System.out.println((Nine%2==1)? (M+2): (M+1));
		}
	}
}
