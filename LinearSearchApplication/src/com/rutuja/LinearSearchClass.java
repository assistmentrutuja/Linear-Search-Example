package com.rutuja;

public class LinearSearchClass {

    public static void main(String[] args) {
    	int[] num= {10,20,30,40,50,60,70,80};
    	int target=50;
    	int ans=linearSearch(num,target);
    	   System.out.println("Result: " + ans);
    	
    }
    
    
    
    static int linearSearch(int[]arr,int target) {
    	if(arr.length==0) {
    		return -1;
    	}
    	for(int i=0;i<arr.length;i++) {
    		int element=arr[i];
    		if(element==target) {
    			return 1;
    			
    		}
    	}
    	return -1;
    	
    }
}
