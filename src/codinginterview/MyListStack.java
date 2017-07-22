package codinginterview;

import java.util.ArrayList;
import java.util.List;

public class MyListStack<T> {
	
	private List<T> list;
	
	public MyListStack() {
		list = new ArrayList();
	}
	
	public void push(T i) {
		list.add(i);
	}
	
	public T pop() {
		return list.remove(list.size()-1); // 많이 쓰는 표현.
	}
	
	public static void main(String[] args) {
		MyListStack<Integer> mls = new MyListStack<Integer>();
		
		for(int i=0; i < 11; i++){
			mls.push(i);
		}
		for(int i=0; i < 11; i++){
			System.out.println(mls.pop());
		}
		
	}
}
