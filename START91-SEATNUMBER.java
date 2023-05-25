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
		do{
		    int N = timtim.nextInt();
		    if(N<=10)
		    {
		        System.out.println("Lower Double");
		    }
		    else if(N<=15)
		    {
		        System.out.println("Lower Single");
		    }
		    else if(N<=25)
		    {
		        System.out.println("Upper Double");
		    }
		    else if(N<=30)
		    {
		        System.out.println("Upper Single");
		    }
		}while(--T>0);
	}
}
