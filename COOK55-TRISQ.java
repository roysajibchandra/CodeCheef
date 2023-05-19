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
		    int B = timtim.nextInt();
		    if(B<4)
		    {
		        System.out.println(0);
		    }
		    else
		    {
		        int X = (B/2)-1;
		        int count = 0;
		        while(X!=0)
		        {
		            count+=X;
		            X--;
		            
		        }
		        System.out.println(count);
		    }
		}
	}
}
