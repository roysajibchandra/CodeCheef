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
		    int X = timtim.nextInt(), Y = timtim.nextInt();
		  //  if(X!=Y && X%Y==0)
		  //  {
		  //      System.out.println("YES");
		  //  }
		  //  else if((X/Y)>=Y)
		  //  {
		  //      System.out.println("YES");
		  //  }
		  //  else
		  //  {
		  //      System.out.println("NO");
		  //  }
		    String rate = (X>=2*Y)? "YES": "NO";
		    System.out.println(rate);
		}
	}
}
