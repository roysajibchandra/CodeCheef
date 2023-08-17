/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void FindCommonElements(int[] arr1,int[] arr2, int[] arr3)
    { 
        // create hashsets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
       
      
        int count = 0;
      
        for (int i : arr1) {
            set1.add(i);
        }
 
       
        for (int i : arr2) {
            set2.add(i);
        }
 
        for( int i : arr3){
            set3.add(i);
        }
        HashSet<Integer> set4 = new HashSet<>(set2);
        HashSet<Integer> set5 = new HashSet<>(set3);
        
        for(int i : set3){
            if(!set4.add(i)){
                set4.remove(i);
            }
        }
        for(int i : set1){
            if(!set5.add(i)){
                set5.remove(i);
            }
        }
        
        set1.retainAll(set2);
        set4.retainAll(set5);
        System.out.print(set1.size()+" "+set4.size());
        System.out.println();
        
        set1.clear();
        set2.clear();
        set3.clear();
        set4.clear();
        set5.clear();
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=  sc.nextInt();
		
		while(t-->0){
		    int s = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] arr = new int[s];
		    int[] ig = new int[m];
		    int[] tr = new int[k];
		    
		    for(int i = 0; i<s; i++){
		        arr[i] = i+1;
		    }
		    
		    for(int i = 0; i<m;i++){
		        ig[i] = sc.nextInt();
		    }
		    for(int i = 0; i<k;i++){
		        tr[i] = sc.nextInt();
		    }
		    
		    FindCommonElements(ig,tr,arr);
		    
		    
		}
	}
}
