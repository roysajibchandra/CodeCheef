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
		    int AP[] = new int[N];
		    for(int i=0; i<N; i++)
		    {
		        AP[i] = timtim.nextInt();
		    }
		    if(N<3)
		    {
		        System.out.println("YES");
		        return;
		    }
		    int i=0;
		    for(i=0; i<N-2; i++)
		    {
		        for(int j=i+1; j<N-1; j++)
		        {
		            for(int k=j+1; k<N; k++)
		            {
		                if((AP[j] - AP[i]) == (AP[k] - AP[j]))
		                {
		                    System.out.println("NO");
		                    i=N;
		                    break;
		                }
		            }
		            if(i==N)
		            break;
		        }
		        if(i==N)
		        break;
		    }
		    if(i==N-2)
		    {
		        System.out.println("YES");
		    }
		}
	}
}
