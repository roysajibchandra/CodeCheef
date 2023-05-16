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
		    int X = timtim.nextInt();
		    int A = (int)Math.pow(2, X);
		    int B = (int)Math.pow(2, N);
		    System.out.println(A/B);
      
//       double X2 = Math.pow(2, X);
// 			while(N-->0)
// 			{
// 				X2 = X2-(0.5*X2);
// 			}
// 			System.out.println((int)X2);
		}
	}
}
