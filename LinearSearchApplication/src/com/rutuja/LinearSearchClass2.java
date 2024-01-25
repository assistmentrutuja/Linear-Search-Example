package com.rutuja;

public class LinearSearchClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//search the target and return element
		int[] num= {10,20,30,40,50};
		int sum=20;
		int ans=linearSearch(num,sum);
		System.out.println(ans);
		
		

	}
        static int linearSearch(int[] arr,int target) {
        	if(arr.length==0) {
        		return -1;
        	}
        	for(int element:arr) {
        		if(element==target) {
        			return element;
        		}
        	}
        	return -1;
        }

}
