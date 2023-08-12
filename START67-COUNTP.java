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
		    int count = 0;
		    for(int k=0; k<Ai.length; k++)
		    {
		        Ai[k] = timtim.nextInt();
		        if(Ai[k]%2==1)
		        {
		            count++;
		        }
		    }
		    if(count>0 && count%2==0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
