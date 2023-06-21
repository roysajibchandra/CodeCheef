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
		    
		    int Real = 0;
		    int Mala = 0;
		    int Barc = 0;
		    int Eibar = 0;
		    for(int i=1; i<=4; i++)
		    {
		        String name = timtim.next();
		        int N = timtim.nextInt();
		        
		        if(name.equals("RealMadrid"))
		        {
		            Real = N;
		        }
		        else if(name.equals("Malaga"))
		        {
		            Mala = N;
		        }
		        else if(name.equals("Barcelona"))
		        {
		            Barc = N;
		        }
		        else if(name.equals("Eibar"))
		        {
		            Eibar = N;
		        }
		    }
		    
		    if(Mala>Real && Barc>Eibar)
		    {
		        System.out.println("Barcelona");
		    }
		    else
		    {
		        System.out.println("RealMadrid");
		    }
		}
	}
}
