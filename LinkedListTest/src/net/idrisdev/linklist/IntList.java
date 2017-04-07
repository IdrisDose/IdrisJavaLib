package net.idrisdev.linklist;

/**
 * Created by d0se on 7/04/17.
 */
public class IntList {
    private int length;
    private Node head;

    public IntList(){
        this.length = 0;
        this.head = null;
    }

    public IntList(Node head, int length){
        this.head = head;
        this.length = length;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void prepend(int data){

    }

    public void append(int data){
        Node newNode = new Node(data);

        if (!this.isEmpty()){
            getTail().setNext(newNode);
        } else {
            head = newNode;
        }

        this.length++;
    }

    public int getHead(){
        return head.getData();
    }

    public Node getTail(){

            if (head.Next() != null) {
                Node curr = head.Next();
                while (curr != null) {
                    curr = curr.Next();
                }
                return curr;
            }
            return head;

    }

    public void printData(){
        if(this.isEmpty()) {
            System.out.println("The list is empty!!");
            return;
        }

        if(head.Next()!=null){
            System.out.println(head.getData());
            Node curr = head.Next();
            while(curr!=null){
                System.out.println(curr.getData());
                curr = curr.Next();
            }
        }
    }

    private class Node {
        private Node next;
        private int num;

        public Node(int data){
            num = data;
        }

        public int getData(){
            return this.num;
        }

        public void setData(int data){
            this.num = data;
        }

        public Node Next(){
            return this.next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }

}
