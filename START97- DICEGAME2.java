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
		    int A1= timtim.nextInt();
		    int A2= timtim.nextInt();
		    int A3= timtim.nextInt();
		    int B1= timtim.nextInt();
		    int B2= timtim.nextInt();
		    int B3= timtim.nextInt();
		    int a = Math.min(A1, Math.min(A2, A3));
		    int b = Math.min(B1, Math.min(B2, B3));
		    int alice = (A1+A2+A3) - a;
		    int bob = (B1+B2+B3) - b;
		    if(alice==bob)
		    {
		        System.out.println("Tie");
		    }
		    else if(alice>bob)
		    {
		        System.out.println("Alice");
		    }
		    else
		    {
		        System.out.println("Bob");
		    }
		}
	}
}
