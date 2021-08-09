package QueueImplementation;
import java.util.*;
class Queue{
    int[] queue;
    int front, rear;
    int capacity;

    // constructor
    Queue(int size){
        front = -1;
        rear = -1;
        queue = new int[size];
        capacity = size;
    }

    // check if queue is null
    boolean isFull(){
        return (front == 0 && rear == capacity-1);
    }

    // check if queue is empty
    boolean isEmpty(){
        return (rear == -1);
    }
    
    // enqueue Operation
    void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full.");
        }
        else{
            if(isEmpty()){
                rear = 0;
                front = 0;
                queue[rear] = element;
            }
            else{
                queue[++rear] = element;
            }
        }
    }

    // dequeue operation
    int dequeue(){
        int element = 0;
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }
        else{
            element = queue[front];
            if(front>rear){
                front = -1;
                rear = -1;
            }
            else{
                front+=1;
            }
        }
        return element;
    }

    // print queue
    void display(){
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i]+"\t");
        }
    }


    //Main method
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the queue: ");
    	int size = sc.nextInt();
        Queue obj = new Queue(size); 
        for(int i=0; i<size; i++) {
        	obj.enqueue(sc.nextInt());
        }
        obj.display();
        System.out.println();
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}