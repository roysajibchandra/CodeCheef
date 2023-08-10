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
		    String S = timtim.next();
		    int count = 0;
		    int y=0, z=0;
		    for(int i = 0; i<N; i++)
		    {
		        for(int j=0; j<N; j++)
		        {
		            if(S.charAt(i)==S.charAt(j))
		            {
		                count++;
		            }
		        }
		        if(count%2==0)
		        {
		            y=1;
		        }
		        else
		        {
		            z++;
		        }
		    }
		    if(y==1 && z==0)
		    {
		        System.out.println("YES");
		    }
		    else if(z>0)
		    {
		        System.out.println("NO");
		    }
		}
	}
}
