package codinginterview;

import java.util.List;
import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		List<String> ls = getPermutations("abc");
		System.out.println(ls);
	}
	
	public static List<String> getPermutations(String s) {
		if(s==null)
			return null;
		return permRec(s, new boolean[s.length()], "", new ArrayList<String>());
	}

	private static List<String> permRec(String s,
										boolean[] pick,
										String perm,
										ArrayList<String> result){
		if(perm.length() == s.length()){
			result.add(perm);
			return result;
		}
		for(int i=0; i<s.length(); i++){
			if(pick[i])
				continue;
			pick[i] = true;
			permRec(s, pick, perm + s.charAt(i), result);
			pick[i] = false;
		}
		return result;
	}
}
