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
		    int M = timtim.nextInt();
		    if(M == (N-(N*0.10)))
		    {
		        System.out.println("EITHER");
		    }
		    else if(M > (N - ((N*0.10))))
		    {
		        System.out.println("ONLINE");
		    }
		    else
		    {
		        System.out.println("DINING");
		    }
		}
	}
}
