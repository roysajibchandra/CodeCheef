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
		    int A1 = timtim.nextInt(), A2 = timtim.nextInt();
		    int B1 = timtim.nextInt(), B2 = timtim.nextInt();
		    int C1 = timtim.nextInt(), C2 = timtim.nextInt();
		    int A = A1+A2;
		    int B = B1+B2;
		    int C = C1+C2;
		    
		    if(A>=B && A>=C)
		    {
		        System.out.println(A);
		    }
		    else if(B>=A && B>=C)
		    {
		        System.out.println(B);
		    }
		    else
		    {
		        System.out.println(C);
		    }


		}
	}
}
