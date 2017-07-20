package codinginterview;

public class Dice {

	public static void main(String[] args) {
		//
		System.out.println(countWays(1));
		System.out.println(countWays(2));
		System.out.println(countWays(3));
		System.out.println(countWays(4));
		System.out.println(countWays(5));
		System.out.println(countWays(6));
		System.out.println(countWays(7));
	}
	
	public static int countWays(int n) {
    	if(n < 0)
    		return 0;
    	if(n==0)
    		return 1;

        return countWays(n-1)+
        		countWays(n-2)+
        		countWays(n-3)+
        		countWays(n-4)+
        		countWays(n-5)+
        		countWays(n-6);
    }

}
