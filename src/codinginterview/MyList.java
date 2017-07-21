package codinginterview;

import java.util.HashSet;
import java.util.Stack;

public class MyList {
	
    private Node head;
    // k가 0부터 시작인지 1부터 시작한지 check
    
    public Node kthToLast(int k) {
        // k가 음수인지 check
    	if(k < 0){return null;}
    	
    	//차이를 나타내기 위한(두 친구가 달리기 한명이 먼저 다른사람이 나중. 그 간격이 포인트) 즉, runner 기법
        Node n1 = head;
        Node n2 = head;
        
        // 시간복잡도 고려, n2가 먼저 달림.
        for(int i=0; i<k; i++){
            if(n2==null){return null;}
            n2 = n2.next;
        }
        
        // 둘이 같이 달림.
        while(n2.next != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }
    
    // 회문 ex) noon, level
    public boolean isPalindrome(){
    	Node n1 = head;
    	Node n2 = head;
    	
    	Stack<Integer> s = new Stack<Integer>();
    	
    	// 일단 stack에 넣음
    	while(n2 != null && n2.next != null){
    		s.push(n1.data);
    		n1 = n1.next;  // n1이 한칸 갈때
    		n2 = n2.next.next; // n2는 두칸 감.
    	}
    	
    	// To skip the middle in the case of "Odd"
    	if(n2 != null){
    		n1 = n1.next;
    	}
    	
    	// stack에 넣은 것을 비교
    	while(n1 != null){
    		if(s.pop() != n1.data){
    			return false;
    		} else {
    			n1 = n1.next; // 다음 것으로 넘어감.
    		}
    	}
    	return true;
    }
    
    public void reverse() {
        Node oldHead = head;
        head = null;

        for(Node n=oldHead; n !=null; n=n.next){
            addToHead(n.data); // optimal enable
        }
    }
    
    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        String str = "[ ";
        for(Node n = head; n!=null; n=n.next) {
            str += n.data;
            str += " ";
        }
        str += "]";
        return str;
    }
    
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;
        Node n = head;

        while(n!=null){
            if(set.contains(n.data)){
                prev.next = n.next;
            } else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }
}