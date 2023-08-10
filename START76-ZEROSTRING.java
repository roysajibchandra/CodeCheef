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
		    int Ones=0, Zeros=0;
		    for(int i=0; i<N; i++)
		    {
		        if(S.charAt(i)=='0')
		        {
		            Zeros++;
		        }
		        else{
		            Ones++;
		        }
		    }
		    if(Ones>Zeros)
		    {
		        System.out.println(Zeros+1);
		    }
		    else
		    {
		        System.out.println(Ones);
		    }
		}
	}
}
