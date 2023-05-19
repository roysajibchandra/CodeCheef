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
		    int count = 0;
		    while(N!=0)
		    {
		        int lastdigit = N%10;
		        if(lastdigit==4)
		        {
		            count++;
		        }
		        else
		        {
		          count +=0;
		        }
		        
		     N /= 10;
		    }
		    
		    System.out.println(count);
		}
	}
}
