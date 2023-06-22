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
            int count=0;
            while(N-->0)
            {
                int Si = timtim.nextInt();
                int Sj = timtim.nextInt();
                int sum = Math.abs(Si-Sj);
                if(sum>5)
                {
                    count++;
                }
            }
            System.out.println(count);

        }
	}
}
