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
            int[] Ai = new int[N];
            int count=0;
            for(int i=0; i<Ai.length; i++)
            {
                Ai[i] = timtim.nextInt();
                if(Ai[i]>=1 && Ai[i]<=7)
                {
                    count = i+1;
                }
            }
            System.out.println(count);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		solve();
	}
}
