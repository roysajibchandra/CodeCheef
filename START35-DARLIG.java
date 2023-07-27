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
		int t = timtim.nextInt();
		for(int i=0; i<t; i++){
		    int n = timtim.nextInt();
		    int k = timtim.nextInt();
		    if(k%4==0){
		        if(n%4==0){
		            System.out.println("Off");
		        }
		        else{
		            System.out.println("On");
		        }
		    }
		    else{
		        if(n%4==0){
		            System.out.println("On");
		        }
		        else{
		            System.out.println("Ambiguous");
		        }
		    }
		}
	}
}
