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
            int K = timtim.nextInt();
            int[] Pi = new int[N];
            int sum = 0;

            for(int i=0; i<Pi.length; i++)
            {
                Pi[i] = timtim.nextInt();
                if(Pi[i]>K)
                {
                    sum = sum + (Pi[i] - K);
                }


            }
//            System.out.println(Arrays.toString(Pi));
            System.out.println(sum);
        }
    }
}
