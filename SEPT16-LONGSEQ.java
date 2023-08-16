/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Scanner timtim = new Scanner(System.in);
    
    public static void solve()
    {
        int T = timtim.nextInt();
		while(T-->0)
		{
		    String D = timtim.next();
		    int one=0;
		    int zero=0;
		    for(int k=0; k<D.length(); k++)
		    {
		        if(D.charAt(k)=='1')
		        {
		            one++;
		        }
		        else
		        {
		            zero++;
		        }
		    }
		  //  if(one==1 || zero==1)
		  //  {
		  //      System.out.println("Yes");
		  //  }
		  //  else
		  //  {
		  //      System.out.println("No");
		  //  }
		  // short
		  System.out.println((one==1 || zero==1)? "Yes": "No");
		  
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		solve();
		
	}
}
