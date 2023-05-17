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
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int C = timtim.nextInt();
		    
		    for(int i = 2; i<=100; i++)
		    {
		        if( A % i != 0 && B % i != 0 && C % i != 0 )
		        {
		            System.out.println( i );
		            break;
		        }
		    }
		}
	}
}
