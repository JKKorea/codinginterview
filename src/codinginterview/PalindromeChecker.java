package codinginterview;

import java.util.Stack;

public class PalindromeChecker {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("love"));
	}
	// noon, level 반으로 잘라서
	public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        
        // 반으로 자름, 홀수도 고려
        for(int i=0; i<len/2; i++){
        	stack.push(s.charAt(i)); // n, o
        }
        // 홀수도 고려
        for(int i = (len+1)/2; i<len; i++){
        	char c = stack.pop();  // o, n
        	if(s.charAt(i) != c){  // o!=o
        		return false;
        	}
        }
		return true;
    }
}
