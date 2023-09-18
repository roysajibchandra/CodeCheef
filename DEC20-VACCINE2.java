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
		    ArrayList<Integer> risk = new ArrayList<Integer>();
 		    ArrayList<Integer> Nonrisk = new ArrayList<Integer>();
 		    
 		    int N = timtim.nextInt();
 		    double D = timtim.nextDouble();
 		    int[] arr = new int[N];
 		    for(int i=0; i<N; i++)
 		    {
 		        arr[i] = timtim.nextInt();
 		    }
 		    
 		    for(int k=0; k<arr.length; k++)
 		    {
 		        if(arr[k]>=80 || arr[k]<=9)
 		        {
 		            risk.add(arr[k]);
 		        }
 		        else
 		        {
 		            Nonrisk.add(arr[k]);
 		        }
 		    }
 		    double a = risk.size()/D;
 		    double b = Nonrisk.size()/D;
 		    
 		    System.out.println((int)Math.round(Math.ceil(a)+Math.ceil(b)));

		}
	}
}
