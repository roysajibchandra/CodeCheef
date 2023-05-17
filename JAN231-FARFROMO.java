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
		    int X1 = timtim.nextInt();
		    int Y1 = timtim.nextInt();
		    int X2 = timtim.nextInt();
		    int Y2 = timtim.nextInt();
		    X1 = Math.abs(X1);
		    Y1 = Math.abs(Y1);
		    X2 = Math.abs(X2);
		    Y2 = Math.abs(Y2);
		    
		    int Alex1 = (int)Math.pow((0-X1),2);
		    int Alex2 = (int)Math.pow((0-Y1),2);
		    double Alex = Math.sqrt(Alex1+Alex2);
		    
		    int Bob1 = (int)Math.pow((0-X2),2);
		    int Bob2 = (int)Math.pow((0-Y2),2);
		    double Bob = Math.sqrt(Bob1+Bob2);
		    
		    if(Bob>Alex)
		    {
		        System.out.println("BOB");
		    }
		    else if(Bob<Alex)
		    {
		        System.out.println("ALEX");
		    }
		    else
		    {
		        System.out.println("EQUAL");
		    }
		    
		}
	}
}
