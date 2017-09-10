package com.mridasoft.interview.stringutils;

public class PalindromeCheck {
	
	
	public static void main(String[] args) {
		
		System.out.println(PalindromeCheck.checkPalindrome("aa"));
		System.out.println(PalindromeCheck.checkPalindrome("ab"));
		System.out.println(PalindromeCheck.checkPalindrome("aba"));
		System.out.println(PalindromeCheck.checkPalindrome("abcdZdcba"));
	}

	public static boolean checkPalindrome(String in) {
		
		int begin, end;
		 
		begin  = 0;
		end    = in.length() - 1;
		
		while(end > begin) {
			if(in.charAt(begin) != in.charAt(end))
				return false;
			else {
				begin ++ ;
				end --;
			}
		}
		
		
		return true;
	}

}
