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
		    for(int j=0; j<Ai.length-1; j++)
		    {
		        if(Ai[j]>Ai[j+1])
		        {
		            int temp = Ai[j];
		            Ai[j] = Ai[j+1];
		            Ai[j+1] =  temp;
		            break;
		        }
		    }
		    int count=0;
		    
		    for(int k=0; k<Ai.length-1; k++)
		    {
		        if(Ai[k]>Ai[k+1])
		        {
		            count++;
		        }
		    }
		    System.out.println((count==0)? "YES": "NO");
		}
	}
}
