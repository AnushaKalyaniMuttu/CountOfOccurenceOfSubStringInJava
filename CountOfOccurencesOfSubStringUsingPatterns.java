package com.bean;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CountOfOccurencesOfSubStringUsingPatterns {

	public static void main (String [] args) {
		String name="bbcccddbbccc";
        String format = "(\\w+)\\1+";
		Pattern pattern=Pattern.compile(format);
		Matcher matcher=pattern.matcher(name);
		Set<String> set=new HashSet<>();
		while(matcher.find()) {
			String eachGroup=matcher.group();
			set.add(eachGroup);			
		}
	
		for(String s: set) {
			countTheOccurencesOfString(name,s);
		}
	}
	private static void countTheOccurencesOfString(String group, String group2) {
		int count=0;
		int lastIndex=0;
		
		while(lastIndex!=-1) {
			lastIndex=group.indexOf(group2,lastIndex);
			if(lastIndex!=-1) {
			count++;
			lastIndex+=group2.length();
		}
		}
		System.out.println(group2+ " "+count);
	}
}
