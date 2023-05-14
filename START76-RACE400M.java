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
		    int alice = timtim.nextInt();
		    int bob = timtim.nextInt();
		    int charlie = timtim.nextInt();
		    
		    if(alice<bob)
		    {
		        String result = (alice<charlie)? "ALICE": "CHARLIE";
		        System.out.println(result);
		    }
		    else if(bob<alice)
		    {
		        String result = (bob<charlie)? "BOB": "CHARLIE";
		        System.out.println(result);
		    }
		    else
		    {
		        System.out.println("CHARLIE");
		    }
		}while(--T>0);
	}
}
