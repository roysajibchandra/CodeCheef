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
		int T= timtim.nextInt(),i;
		String Ans;
		while(T-->0){
		    long N = timtim.nextLong();
		    long K = timtim.nextLong();
		    long X;
		    Ans="NO";
		    
		    if(K > N/2){
		        System.out.println("NO");
		    }
		    else{
		        if(N%2 == 0){
		            X=N/2;
		        }
		        else{
		            X=(N+1)/2;
		        }
		        
		        long remaining = K-X;
		        if(remaining%2 == 0){
		            Ans="YES";
		        }
		        
		        System.out.println(Ans);
		    }
		}
	}
}
