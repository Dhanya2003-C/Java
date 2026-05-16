//Find maximum value from array.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the Value: ");
        for (int i=0;i<arr.length ;i++ ){
            arr[i]=sc.nextInt();
        } 
        
        System.out.println("Array: "+Arrays.toString(arr));
        
        int result = max(arr);
        System.out.println("Max Value is: "+result);
        
	}
	
	public static int max(int[] arr){
	    int a=Integer.MIN_VALUE;
	    if(arr.length==0){
	        return -1;
	    }
	    for (int i=0; i<arr.length ;i++ ){
	        if(a<arr[i]){
	            a=arr[i];
	        }
	    }
	    return a;
	}
	
}
