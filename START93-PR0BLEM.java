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
		    int N = timtim.nextInt(), X = timtim.nextInt();
		    System.out.println((N+X)%2==0? "YES": "NO");
		    
		  //  if(N==X)
		  //  {
		  //      System.out.println("YES");
		  //  }
		  //  else if(N>X)
		  //  {
		  //      int N1 = N-1;
		  //      int X1 = X+1;
		  //      System.out.println((N1==X1)? "YES": "NO");
		  //  }
		  //  else
		  //  {
		  //      int X2 = X-1;
		  //      int N2 = N+3;
		  //      System.out.println((N2==X2)? "YES": "NO");
		  //  }
		}
	}
}
