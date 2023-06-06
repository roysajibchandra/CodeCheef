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
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    
		    int a[] = new int[n];
		    
		    for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
		    
		    int b[] = new int[n];
		    
		    for (int i = 0 ; i < n ; i++ ) b[i] = sc.nextInt();
		    
		    int count = 0;
		    
		    int max = 0;
		    
		    for( int i = 0 ; i < n ; i++ ){
		        
		        if( a[i] != 0 && b[i] != 0 ) count++;
		        else{
		            max = Math.max( max , count  );
		            count = 0;
		        }
		        if( i == n - 1 ){
		            max = Math.max( max , count  );
		            count = 0;
		        }
		        
		    }
		    
		    System.out.println(max);
		    
		}
	}
}
