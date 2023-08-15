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
		    int[] B = new int[1001];
		    
		    for(int i=0; i<N; i++)
		    {
		        Ai[i] = timtim.nextInt();
		        B[Ai[i]]++;
		    }
		    Arrays.sort(B);
		  //  if(B[1000]!=B[999])
		  //  {
		  //      System.out.println("YES");
		  //  }
		  //  else
		  //  {
		  //      System.out.println("NO");
		  //  }
		  
		  //sort 
		  System.out.println((B[1000]!=B[999]? "YES": "NO"));
		}
	}
}
