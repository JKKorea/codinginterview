package codinginterview;

import java.util.List;
import java.util.ArrayList;

public class Parentheses {
    public static List<String> getPairs(int n) {
		if(n==0)
			return null;
		return getPairsRec(n, n, "", new ArrayList<String>());
	}

	private static List<String> getPairsRec(int l, int r, String pairs, ArrayList<String> list){
		if(l>r)
			return list;
		if(l<0 || r<0)
			return list;
		if(l==0 && r==0){
			list.add(pairs);
			return list;
		}
		getPairsRec(l-1, r, pairs + "(", list);
		getPairsRec(l, r-1, pairs + ")", list);
		return  list;
	}
	
	public static void main(String[] args) {
		System.out.println(getPairs(2));
	}
}