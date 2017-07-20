package codinginterview;

import java.lang.RuntimeException;

public class SingleLinkedList {
    private Node head;
    
    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }
    
    public void removeFirst() {
        if(head == null){
            throw new RuntimeException("Nothing to remove");
        }
        head = head.next;
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
}
