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
		    double N = timtim.nextInt();
		    double X = timtim.nextInt();
		    double Y = timtim.nextInt();
		    double A = timtim.nextInt();
		    double B = timtim.nextInt();
		    
		    if(N/A*X > N/B*Y)
		    {
		        System.out.println("DIESEL");
		    }
		    else if((X/A)<(Y/B))
		    {
		        System.out.println("PETROL");
		    }
		    else
		    {
		        System.out.println("ANY");
		    }
		}
	}
}
