package codinginterview;

import java.util.ArrayList;

public class Exercise {

	public static void main(String[] args) {
		System.out.println(bitCombinations(1));
		System.out.println(bitCombinations(2));
		System.out.println(bitCombinations(3));
		System.out.println(bitCombinations(4));
	}
	public static ArrayList<String> bitCombinations(int n) {
        return bitCombRec(n, "", new ArrayList<String>());
    }

    private static ArrayList<String> bitCombRec(int n, String s, ArrayList<String> list){
        if(n == s.length()){
            list.add(s);
            return list;
        }
        bitCombRec(n, s + "0", list);
        bitCombRec(n, s + "1", list);
        return  list;
    }

}
