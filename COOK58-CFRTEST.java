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
		    int count = 0;
		    int test[] = new int[N];
		    for(int i=0; i<N; i++)
		    {
		        test[i] = timtim.nextInt();
		    }
		    Arrays.sort(test);
		    for(int j=0; j<N-1; j++)
		    {
		        if(test[j] != test[j+1])
		        {
		            count++;
		        }
		    }
		    System.out.println(count+1);
		}
	}
}
