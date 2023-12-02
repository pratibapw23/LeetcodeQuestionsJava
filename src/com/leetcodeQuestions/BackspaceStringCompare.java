package com.leetcodeQuestions;

import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		
		String s = "a##c", t = "#a#c";
		boolean res=backspaceStringCompare(s,t);
		System.out.println(res);

	}

	private static boolean backspaceStringCompare(String s, String t) {
		Stack<Character> s1=new Stack<>();
		Stack<Character> s2=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='#') {
				s1.push(s.charAt(i));
			
			}else
			{
				if(!s1.isEmpty())
					s1.pop();
			}
				
		}
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)!='#') {
				s2.push(t.charAt(i));
			
			}else
			{
				if(!s2.isEmpty())
					s2.pop();
			}
				
		}
		
		if(s1.equals(s2))
			return true;
		return false;
	}

}
