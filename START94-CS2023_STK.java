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
            int[] A = new int[N];
            int[] B = new int[N];
            int cnt1 = 0, cnt2 = 0, max1=0, max2=0;

            for(int i=0; i<N; i++)
            {
                A[i] = timtim.nextInt();
                if(A[i] > 0) cnt1++;
                else cnt1 = 0;
                
                if(cnt1>max1) max1=cnt1;

//               B[i] = timtim.nextInt();
            }
            for(int j=0; j<N; j++)
            {
//                A[i] = timtim.nextInt();
                B[j] = timtim.nextInt();
                if(B[j] > 0) cnt2++;
                else cnt2=0;
                
                if(cnt2>max2) max2=cnt2;
            }

            // System.out.println(Arrays.toString(A));
            // System.out.println(Arrays.toString(B));

            if(max1 == max2)
            {
                System.out.println("Draw");
            } 
            else if (max1 < max2)
            {
                System.out.println("Addy");
            }
            else
            {
                System.out.println("Om");
            }

//            System.out.println(cnt1);
//            System.out.println(cnt2);
		    
		}
	}
}
