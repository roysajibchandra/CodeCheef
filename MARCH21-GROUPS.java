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
		    
		    String S = timtim.next().concat("0");
		    int N = S.length();
		    int count=0;
		    for(int i=1; i<N; i++)
		    {
		        if(S.charAt(i-1)=='1'  && S.charAt(i)=='0')
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
