/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int solve(int N, int X)
    {
        if(N==0)
        {
            return 0;
        }
        int temp = (int)Math.sqrt(N);
		int temp1 = N-(temp*temp);
		X = 1+solve(temp1, X);
		return X;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		while(T-->0)
		{
		    int N = timtim.nextInt();
		    int result = solve(N, 0);
		    System.out.println(result);
		}
	}
}
