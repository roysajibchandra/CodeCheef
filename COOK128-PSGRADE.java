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
		    int Amin = timtim.nextInt();
		    int Bmin = timtim.nextInt();
		    int Cmin = timtim.nextInt();
		    int Tmin = timtim.nextInt();
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int C = timtim.nextInt();
		    
		    if(Amin<=A && Bmin<=B && Cmin<=C)
		    {
		        System.out.println((A+B+C)>=Tmin? "YES": "NO");
		      //  if((A+B+C)>=Tmin)
		      //  {
		      //      System.out.println("YES");
		      //  }
		      //  else
		      //  {
		      //      System.out.println("NO");
		      //  }
		    }
		    else 
		    {
		        System.out.println("NO");
		    }
		}
	}
}
