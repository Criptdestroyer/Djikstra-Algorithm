package Dijkstra;

/**
 *
 * @author alfath
 */
public class Queue {
    private Node head; //data paling depan
    private Node tail; //data paling belakang
    private int size; //size dri queue
    
    public Queue(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void enqueue(int data){
        Node temp = new Node(data, null);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            
            tail.setNext(temp); //next dari tail itu data yg bru
            tail = temp; //data yang baru
        }
        size++;
    }
    
    public int dequeue(){
        Node temp;
        int data;
        if(isEmpty()){
            System.out.println("there is no queue");
            return -1;
        }else{
            temp = head;
            head = head.getNext();
            data = temp.getData();
            size--;
            return data;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void display(){
        System.out.print("Queue = ");
        if(size == 0){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public int getSize() {
        return size;
    }
}
