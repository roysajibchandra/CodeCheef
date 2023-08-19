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
		    char ch[] = S.toCharArray();
		    
		    for(int i=0; i<N/2; i++)
		    {
		        if(ch[i]>ch[N-1-i])
		        {
		            char ch1 = ch[i];
		            ch[i] = ch[N-1-i];
		            ch[N-1-i] = ch1;
		        }
		    }
		    int c=0;
		    for(int i=0; i<N-1; i++)
		    {
		        if(ch[i]>ch[i+1])
		        {
		            c=1;
		            break;
		        }
		    }
		    if(c==1)
		    {
		        System.out.println("NO");
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		    
		}
	}
}
