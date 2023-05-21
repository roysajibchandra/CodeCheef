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
		    String S = timtim.next(); //1st input String
		    
		    String A = Character.toString(S.charAt(0)) + Character.toString(S.charAt(1));
		    String B = Character.toString(S.charAt(3)) + Character.toString(S.charAt(4));
		    
		    int M = Integer.parseInt(A); //used Integer.parseInt(); to convert String into char
		    int N = Integer.parseInt(B);
		    
		    if(M<=12 && N<=12)
		    {
		        System.out.println("BOTH");
		    }
		    else if(M<=12)
		    {
		        System.out.println("MM/DD/YYYY");
		    }
		    else
		    {
		        System.out.println("DD/MM/YYYY");
		    }
		}
	}
}
