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
		    int N = timtim.nextInt();
		    int X = timtim.nextInt();
		    int S = timtim.nextInt();
		    
		    for(int i=0; i<S; i++)
		    {
		        int A = timtim.nextInt();
		        int B = timtim.nextInt();
		        
		        if(A==X|| B==X)
		        {
		            X = A+B-X;
		        }
		    }
		    System.out.println(X);
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		solve();

	}
}
