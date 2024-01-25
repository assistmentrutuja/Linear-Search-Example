package com.rutuja;

public class LinearSearchClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return true or false
		int[] a= {10,30,60,40,70,100};
		int a1=100;
		boolean a3=LinearSearch(a,a1);
		System.out.println(a3);
		

	}
	static boolean LinearSearch(int[] arr,int target) {
		if(arr.length==0) {
			return false;
		}
		for(int element:arr) {
			if(element==target)
				return true;
		}
	
	

	return false;

}
}
