package codinginterview;

public class MyArrayStack {
	private int[] data = new int[100];
	private int topIndex = -1;
		
	public void push(int i) {
		if(data.length == topIndex-1){
			int[] oldData = data;
			data = new int[data.length * 2];
			System.arraycopy(oldData, 0, data, 0, oldData.length);
		}
		topIndex++;
		data[topIndex] = i;
	}
	public int pop() {
		if(topIndex < 0) {
			throw new RuntimeException("Nothing to pop");
		}
		return data[topIndex--];
	}
	public static void main(String[] args) {
		MyArrayStack mas = new MyArrayStack();
		for(int i=0; i < 10; i++){
			mas.push(i);
		}
		for(int i=0; i < 11; i++){
			System.out.println(mas.pop());
		}
	}
}
