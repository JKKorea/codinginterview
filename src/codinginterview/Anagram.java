package codinginterview;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("abcd", "dcba"));
		System.out.println(isAnagram("apple", "appll"));

	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c: s1.toCharArray()){
			if(hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}		
		for(char c: s2.toCharArray()){
			if(!hm.containsKey(c))
				return false;
			if(hm.get(c) == 0)
				return false;
			hm.put(c, hm.get(c) - 1);
		}

		return true;
	}

}
