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
		while(T-->0){
		    int N = timtim.nextInt();
		    int B = timtim.nextInt();
		    int area = -1;
		    while(N-->0)
		    {
		        
		        int area1 = timtim.nextInt()*timtim.nextInt();
		      //  int H = timtim.nextInt();
		        int P = timtim.nextInt();
		      //  int area1 = W*H;
		        
		        if(B>=P)
		        
		            if(area1 > area)
		            
		                area = area1;
		            
		                
		        
		        
		    }
		    System.out.println((area == -1)? "no tablet": area);
		}
	}
}
