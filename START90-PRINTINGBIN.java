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
		int[] arr;
		while(T-->0)
		{
		    int X = timtim.nextInt();
		    arr = new int[X];
		    
		    for(int i = 0; i<X; i++)
		    {
		        arr[i] = timtim.nextInt();
		    }
		    
		    for(int j = 0; j<X; j++)
		        {
		            if(arr[j] == 0)
		            {
		                System.out.print(1);
		            }
		            else if(arr[j] == 1)
		            {
		                System.out.print(0);
		            }
		            if(X>1)
		            {
		                System.out.print(" ");
		            }
		        }
		    System.out.println();
		}
	}
}
