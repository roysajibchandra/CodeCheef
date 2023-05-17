/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void RETURNCHANGE(int X)
	{
		int N = 100-X;
		    if(N%10==0)
		    {
		        System.out.println(N);
		    }
		    else
		    {
		        if((N%10)<=5)
		        {
		            System.out.println(N-(N%10));
		        }
		        else
		        {
		            System.out.println(N+10-(N%10));
		        }
		    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		do{
		    int X = timtim.nextInt();
		    RETURNCHANGE(X);
		}while(--T>0);
	}
}
