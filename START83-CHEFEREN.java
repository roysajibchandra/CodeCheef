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
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int count = 0;
		    int j = 1;
		    while(j<=N)
		    {
		        if(j%2==0)
		        {
		            count += A;
		        }
		        else
		        {
		            count += B;
		        }
		        j++;
		    }
		    System.out.println(count);
		}
	}
}
