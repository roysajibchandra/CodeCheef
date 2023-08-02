/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int GCD(int A, int O)
    {
        if(A==0)
        {
            return O;
        }
        
        return GCD(O%A, A);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		while(T-->0)
		{
		    int A = timtim.nextInt();
		    int O = timtim.nextInt();
		   
		    System.out.println(GCD(A, O));
		}
	}
}
