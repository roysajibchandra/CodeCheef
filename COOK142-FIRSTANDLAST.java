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
		    int[] Ai = new int[N];
		    for(int i=0; i<Ai.length; i++)
		    {
		        Ai[i] = timtim.nextInt();
		    }
		    int max = Ai[0] + Ai[N-1];
		    int sum = 0;
		    for(int j=0; j<N-1; j++)
		    {
		        int temp = Ai[j] + Ai[j+1];
		        if(temp>sum)
		        {
		            sum = temp;
		        }
		    }
		    System.out.println(Math.max(max, sum));
		}
	}
}
