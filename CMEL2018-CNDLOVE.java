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
		    int[] Ai = new int[N];
		    int sum=0;
		    for(int i=0; i<Ai.length; i++)
		    {
		        Ai[i] = timtim.nextInt();
		        sum += Ai[i];
		    }
		    
// 		    if(sum%2!=0)
// 		    {
// 		        System.out.println("YES");
// 		    }
// 		    else
// 		    {
// 		        System.out.println("NO");
// 		    }
            System.out.println((sum%2!=0)? "YES": "NO");
		}
	}
}
