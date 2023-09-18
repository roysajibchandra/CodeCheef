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
		    int P = timtim.nextInt();
		    int Q = timtim.nextInt();
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    
		    if(P==A && Q==B)
		    {
		        System.out.println(0);
		    }
		    else {
		        if((P+Q+A+B)%2==0)
		        {
    		        System.out.println(2);
		        }
		    
		        else
		        {
		         System.out.println(1);
		         }
		    }
		}
	}
}
