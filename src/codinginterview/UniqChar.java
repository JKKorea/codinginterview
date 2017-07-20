package codinginterview;

import java.util.HashSet;

public class UniqChar {
	public static boolean isUniqChar(String s){
		HashSet<Character> set = new HashSet<Character>();

		for(char c: s.toCharArray()){
			if(set.contains(c))
				return false;
			set.add(c);
		}

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isUniqChar("aaaa"));
		System.out.println(isUniqChar("abcd"));
	}
}
