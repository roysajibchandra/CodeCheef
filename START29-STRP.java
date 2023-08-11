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
		    String S = timtim.next();
		    int count=0;
		    for(int i=0; i<S.length(); i++)
		    {
		        if(i<S.length()-1 && S.charAt(i)==S.charAt(i+1))
		        {
		            i++;
		        }
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
