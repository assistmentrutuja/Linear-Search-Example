package com.rutuja;

import java.util.Arrays;

public class LinearSearchClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rutuja";
		char ch1='r';
		boolean str1=search(str,ch1);
		System.out.println(str1);
		System.out.println(Arrays.toString(str.toCharArray()));
		

	}
	static boolean search(String str,int target) {
		if(str.length()==0) {
			return false;
		}
		for(char ch:str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}

}
