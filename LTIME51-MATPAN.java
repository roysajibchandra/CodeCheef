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
		    int[] Letter = new int[26];
		    for(int i=0; i<26; i++)
		    {
		        Letter[i] = timtim.nextInt();
		    }
		    String S = timtim.next();
		    int Total = 0;
		    for(int j='a'; j<='z'; j++)
		    {
		        if(S.indexOf(j)==-1)
		        {
		            Total = Total + Letter[j - 'a'];
		        }
		    }
		    System.out.println(Total);
		}
	}
}
