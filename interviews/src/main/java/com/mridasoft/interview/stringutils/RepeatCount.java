package com.mridasoft.interview.stringutils;

import java.util.HashMap;
import java.util.Map;

public class RepeatCount {

	public static Map<Character, Integer> countRepeatedChars(final String in) {

		String val = in;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int n = val.length();
		
		for (int i = 0; i < n; i++) {

			final char curr = val.charAt(i);
			int rpt = 1;
			
			while( i < n-1 && val.charAt(i+1) == curr ) {
				rpt++;
				i++;
			}
			
			if(rpt > 1) {
				
				if(map.get(curr) != null) {
					int prevCount = map.get(curr);
					map.put(curr, prevCount > rpt ? prevCount : rpt);
				} else {
					map.put(curr, rpt);
				}
			}
			
		}
		
		return map;
	}

}
