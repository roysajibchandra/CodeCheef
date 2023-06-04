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
		    int B1 = timtim.nextInt();
		    int B2 = timtim.nextInt();
		    int B3 = timtim.nextInt();
		    
		    if((B1== 0 && B2==0) || (B2==0 &&B3==0) || (B1==0 &&B3==0))
		    {
		        System.out.println("Water filling time");
		    }
		    else
		    {
		        System.out.println("Not now");
		    }
		}
	}
}
