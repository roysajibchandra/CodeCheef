/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static int checkReqSubArray(int []arr,int n)
    {
        int ans=0;
         for(int i=0;i<n;i++)
         {
             int sum=0,prod=1;
             for(int j=i;j<n;j++)
             {
                 sum+=arr[j];
                 prod*=arr[j];
                 if(sum==prod)
                   ans++;
             }
            
         }
         
         return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
		while(T-->0)
		{
		    int n= scan.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]= scan.nextInt();
		    }
		    int ans= checkReqSubArray(arr,n);
		    System.out.println(ans);
		}
	}
}
