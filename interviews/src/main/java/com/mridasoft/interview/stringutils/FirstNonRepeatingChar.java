package com.mridasoft.interview.stringutils;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		System.out.println(findFirstNonRepeatingCharacter("ABCA"));
	}

	public static Character findFirstNonRepeatingCharacter(String in) {
		Map<Character,Integer> charCount = new HashMap<>();
		char[] inChar = in.toCharArray();
		for(char ch : inChar) {
			charCount.compute(ch, (K,V) -> V == null? 1 : V+1);
		}
		for(char ch:inChar)
			if(charCount.get(ch)==1)
				return ch;
		return null;
	}
}
