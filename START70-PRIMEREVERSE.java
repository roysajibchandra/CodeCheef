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
		    String A = timtim.next();
		    String B = timtim.next();
		    int a=0, b=0;
		    
		    for(int i=0; i<N; i++)
		    {
		        if(A.charAt(i)=='1')
		        {
		            a++;
		        }
		        if(B.charAt(i)=='1')
		        {
		            b++;
		        }
		    }
		    
		    System.out.println((a==b)? "YES": "NO");
		}
	}
}
