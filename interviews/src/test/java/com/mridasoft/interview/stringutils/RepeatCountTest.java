package com.mridasoft.interview.stringutils;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.mridasoft.interview.stringutils.RepeatCount;

public class RepeatCountTest {
	
	@Test
	public void testNoRepeats() {
		Map<Character, Integer> rptCount = RepeatCount.countRepeatedChars("ABCDEF");
		
		Assert.assertEquals(0, rptCount.size());
	}
	
	@Test
	public void testSingleRepeatCount() {
		Map<Character, Integer> rptCount = RepeatCount.countRepeatedChars("AAACDCDBBBB");
		
		Assert.assertEquals(Integer.valueOf(3), rptCount.get(Character.valueOf('A')));
		
		Assert.assertEquals(Integer.valueOf(4), rptCount.get(Character.valueOf('B')));
		
	}
	
	@Test
	public void testMultiRepeatCount() {
		Map<Character, Integer> rptCount = RepeatCount.countRepeatedChars("AAABBBBCDCDBB");
		
		Assert.assertEquals(Integer.valueOf(3), rptCount.get(Character.valueOf('A')));
		
		Assert.assertEquals(Integer.valueOf(4), rptCount.get(Character.valueOf('B')));
		
	}
	
	@Test
	public void testSingleChar() {
		Map<Character, Integer> rptCount = RepeatCount.countRepeatedChars("AAA");
		
		Assert.assertEquals(Integer.valueOf(3), rptCount.get(Character.valueOf('A')));
				
	}

}
