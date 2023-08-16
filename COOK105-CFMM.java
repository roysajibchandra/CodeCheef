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
		    int c=0, o=0, d=0, e=0, h=0, f=0;
		    while(N-->0)
		    {
		        String S = timtim.next();
		        for(int i=0; i<S.length(); i++)
		        {
		            if(S.charAt(i)=='c')
		            {
		                c++;
		            }
		            else if(S.charAt(i)=='o')
		            {
		                o++;
		            }
		            else if(S.charAt(i)=='d')
		            {
		                d++;
		            }
		            else if(S.charAt(i)=='e')
		            {
		                e++;
		            }
		            else if(S.charAt(i)=='h')
		            {
		                h++;
		            }
		            else if(S.charAt(i)=='f')
		            {
		                f++;
		            }
		        }
		    }
		    int[] arr = {c/2, o, d, e/2, h, f};
		    Arrays.sort(arr);
		    System.out.println(arr[0]);
		}
	}
}
