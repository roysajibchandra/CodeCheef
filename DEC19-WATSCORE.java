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

        int N = timtim.nextInt();
        while(N-->0)
        {
            int T = timtim.nextInt();
            int[] arr = new int[12];
            while(T-->0)
            {
                int Si = timtim.nextInt();
                int Pi = timtim.nextInt();
                if(Pi>arr[Si])
                {
                    arr[Si] = Pi;
                }
            }
            int sum=0;
            for(int i = 0; i<=8; i++)
            {
                sum += arr[i];
            }
            System.out.println(sum);
        }
	}
}
