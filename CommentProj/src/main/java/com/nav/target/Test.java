package com.nav.target;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String data1 = "Today, java is bad lang";
	       
		String regex = "bad";
		 
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data1);
		if (matcher.find())
		{
			System.out.println("OFFENSIVE!!!");
		}
		else
			System.out.println("good!!!");
	}
}
