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
		    int X = timtim.nextInt();
		    if(X%2==0)
		    {
		        for(int i=X; i>=1; i--)
		        {
		            System.out.print(i +" ");
		        }
		        System.out.println();
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		}
	}
}
