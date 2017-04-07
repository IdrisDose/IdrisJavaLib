package net.idrisdev.linklist;

import javax.xml.crypto.Data;

/**
 * Created by d0se on 7/04/17.
 */
public class GenList<T> {
    private int length;
    private Node head;

    public GenList(){
        this.length = 0;
        this.head = null;
    }

    public GenList(Node head, int length){
        this.head = head;
        this.length = length;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void prepend(T data){

    }

    public void append(T data){
        Node newNode = new Node(data);

        if (this.isEmpty()){
            getTail().setNext(newNode);
        } else {
            head = newNode;
        }

        this.length++;
    }

    public T getHead(){
        return (T)head.getData();
    }

    public Node getTail(){
        if(this.isEmpty())
            return new Node("EMPTY");
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

    private class Node<T> {
        private Node next;
        private T data;

        public Node(T data){
            this.data = data;
        }

        public T getData(){
            return this.data;
        }

        public void setData(T data){
            this.data = data;
        }

        public Node Next(){
            return this.next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }

}
