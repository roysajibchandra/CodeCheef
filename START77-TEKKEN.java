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
		for(int i=1; i<=T; i++)
		{
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int C = timtim.nextInt();
		    
		    int D = Math.max(B, C) - Math.min(B, C);
		    if(A>D)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
