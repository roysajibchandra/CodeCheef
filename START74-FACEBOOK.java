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
		    int[] A_it = new int[N];
		    int[] B_it = new int[N];
		    
		    for(int i=0; i<N; i++)
		    {
		        A_it[i] = timtim.nextInt();
		    }
		    for(int i=0; i<N; i++)
		    {
		        B_it[i] = timtim.nextInt();
		    }
		    
		    int MaxLikes = 0;
		    int MaxComment = 0;
		    int Index = 0;
		    
		    for(int j=0; j<N; j++)
		    {
		        if(A_it[j] > MaxLikes || (A_it[j]==MaxLikes && B_it[j]>MaxComment))
		        {
		            MaxLikes = A_it[j];
		            MaxComment = B_it[j];
		            Index = j;
		        }
		    }
		    System.out.println(Index+1);
		}
	}
}
