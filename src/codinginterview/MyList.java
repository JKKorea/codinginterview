package codinginterview;

import java.util.HashSet;

public class MyList {
    private Node head;

    public Node kthToLast(int k) {
        if(k < 0){return null;}
        Node n1 = head;
        Node n2 = head;

        for(int i=0; i<k; i++){
            if(n2==null){return null;}
            n2 = n2.next;
        }
        while(n2.next != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
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