package codinginterview;

public class StringToInt {

	public static void main(String[] args) {
		
		char c ='1';
		System.out.println(c-'0');
		
		System.out.println(convert("123"));
	}
	
	public static int convert(String s){
		char[] ca = s.toCharArray();
		int num = 0;
		// 123
		// 1*10+2 = 12
		// 12*10+3 = 123
		for(char c:ca){
			num *=10;
			num += c - '0';
		}
		return num;
	}
}
