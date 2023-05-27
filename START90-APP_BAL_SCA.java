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
		    long M = timtim.nextLong();
		    long N = timtim.nextLong();
		    
		    if(N>M)
		    {
		        System.out.println("NO");
		    }
		    else if(M==N)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        if(M%2==1)
		        {
		          System.out.println("NO");
		        }
		        else
		        {
		          while(M%2==0)
		          {
		            M /= 2;
		          }
		          
		          if(N%M==0)
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
	}
}
