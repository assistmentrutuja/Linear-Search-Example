package com.rutuja;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rutuja";
		char ch='i';
		boolean b=search(str,ch);
		System.out.println(b);
		
		
		
	}
	static boolean search(String str,int target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
		