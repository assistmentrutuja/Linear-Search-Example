package com.rutuja;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {10,20,30,40,50,60,70,80};
		int target=30;
		System.out.println(searchinrange(arr1,target,1,4));
		

	}
	static int searchinrange(int[]arr,int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=start;i<end;i++) {
			int element=arr[i];
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	

}
