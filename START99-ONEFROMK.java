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
		while(T-->0){
		    int N = timtim.nextInt();
		    long[] Ai = new long[N];
		    for(int i=0; i<Ai.length; i++)
		    {
		        Ai[i] = timtim.nextInt();
		    }
		    long sum = 0;
		    for(int j=0; j<Ai.length; j++)
		    {
		        sum+=Ai[j];
		    }
		    Arrays.sort(Ai);
		    
		    for(long nums:Ai)
		    {
                System.out.print(sum+" ");
                sum=sum-nums;
         
            } 
            System.out.println();
		    
		}
	}
}
