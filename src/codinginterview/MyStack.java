package codinginterview;

import java.util.Stack;

public class MyStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
	
	public MyStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	public void push(int newVal) {
		if(minStack.isEmpty() || newVal <= minStack.peek()){
			minStack.push(newVal);
		}
		stack.push(newVal);
	}
	
	public int pop() {
		int val = stack.pop();
		
		// 최소값이 여러번 들어갈수도있다.
		if(!minStack.isEmpty() && val == minStack.peek()){
			minStack.pop();
		}
		return val;
	}
	
	// 저장된 값중 최소값을 반환 O(1) 
	public int min() {
		if(minStack.isEmpty())
			return Integer.MAX_VALUE;
		return minStack.peek();
	}
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(4);
		ms.push(2);
		ms.push(1);
		ms.push(3);
		ms.push(5);
		
		// 4 2 1 3 5
		System.out.println(ms.pop());  // 5
		System.out.println(ms.min());
	}
}
