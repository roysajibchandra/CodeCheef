/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner timtim =new Scanner(System.in);
		int T = timtim.nextInt();
		while(T-->0){
		    int n=timtim.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    int i,j,k;
		    for(i=0;i<n;i++){
		        a[i]=timtim.nextInt();
		    }
		    for(j=0;j<n;j++){
		        b[j]=timtim.nextInt();
		    }
		    int count=0;
		    for(k=0;k<n;k++){
		        if(2*a[k]>=b[k] && a[k]<=2*b[k]){
		            count++;
		        }
		        
		    }
		    System.out.println(count);
		    
		}
	}
}
