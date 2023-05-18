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
		    int P = timtim.nextInt();
		    int Q = timtim.nextInt();
		    int R = timtim.nextInt();
		    int S = timtim.nextInt();
		    
		    int A = Math.max(P, Q);
		    int B = Math.max(R, S);
		    int C = Math.max(A, B);
		    if(C == P)
		    {
		        if((Q+R+S)<P)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    else if(C==Q)
		    {
		        if((P+R+S)<Q)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    else if(C==R)
		    {
		        if((P+Q+S)<R)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    else
		    {
		        if((P+Q+R)<S)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    
		  //  System.out.println(C);
		}while(--T>0);
	}
}
