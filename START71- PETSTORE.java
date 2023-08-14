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
		    int[] Ai = new int[101];
		    for(int k=0; k<101; k++)
		    {
		        Ai[k]=0;
		    }
		    for(int i=0; i<N; i++)
		    {
		        int Aii = timtim.nextInt();
		        Ai[Aii]=Ai[Aii]+1;
		    }
		    if(N%2==1)
		    {
		        System.out.println("NO");
		    }
		    else
		    {
		        int flag=0;
		        for(int j=0; j<101; j++)
		        {
		            if(Ai[j]%2!=0)
		            {
		                flag=1;
		            }
		        }
		      //  if(flag==1)
		      //  {
		      //      System.out.println("NO");
		      //  }
		      //  else
		      //  {
		      //      System.out.println("YES");
		      //  }
		      //sort 
		      System.out.println((flag==1)? "NO": "YES");
		    }
		}
	}
}
