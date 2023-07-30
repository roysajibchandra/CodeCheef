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
		    String Bi = timtim.next();
		    double r , c=0;
		    for(int i=0; i<N; i++)
		    {
		        if(Bi.charAt(i)=='1')
		        {
		            c++;
		        }
		    }
		    r = ((c+(120-N))/120)*100;
		    System.out.println((r>=75.00f)? "YES": "NO");
		  //  if(r>=75.00f)
		  //  {
		  //      System.out.println("YES");
		  //  }
		  //  else
		  //  {
		  //      System.out.println("NO");
		  //  }
		}
	}
}
