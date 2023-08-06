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
		    int K = timtim.nextInt();
		    int[] Ai = new int[N];
		    
		    for(int i=0; i<Ai.length; i++)
		    {
		        Ai[i] = timtim.nextInt();
		        if(K>=Ai[i])
		        {
		            K -= Ai[i];
		            System.out.print(1);
		        }
		        else
		        {
		            System.out.print(0);
		        }
		    }
		    System.out.println();
		    
		}
	}
}
