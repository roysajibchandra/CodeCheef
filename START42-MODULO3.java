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
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int X = A%3;
		    int Y = B%3;
		    if(X==0 || Y==0)
		    {
		        System.out.println(0);
		    }
		    else if(X==Y)
		    {
		        System.out.println(1);
		    }
		    else
		    {
		        System.out.println(2);
		    }
		}
	}
}
