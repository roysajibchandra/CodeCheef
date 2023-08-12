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
		    int Y=0, M=0, I=0;
		    for(int k=0; k<N; k++)
		    {
		        if(S.charAt(k)=='Y')
		        {
		            Y++;
		        }
		        else if(S.charAt(k)=='N')
		        {
		            M++;
		        }
		        else if(S.charAt(k)=='I')
		        {
		            I++;
		        }
		    }
		    if(I!=0)
		    {
		        System.out.println("INDIAN");
		    }
		    else if(Y!=0)
		    {
		        System.out.println("NOT INDIAN");
		    }
		    else
		    {
		        System.out.println("NOT SURE");
		    }
		}
	}
}
