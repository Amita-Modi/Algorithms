import java.util.Scanner;

public class Stack {
	int[] data;
	int top;
	int capacity;
	
	//Constructor
	Stack(int capacity){
		this.capacity = capacity;
		data = new int[capacity];
		top=-1;
	}
	
	//Check if the Stack is full
	boolean isFull() {
		return (top == capacity-1);
	}
	
	//Check if the Stack is empty
	boolean isEmpty() {
		return (top == -1);
	}
	
	//Push Operation
	void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full.");
		}
		else {
			top+=1;
			data[top] = value;
		}
	}
	
	//Pop Operation
	int pop() {
		int value = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}
		else {
			value = data[top];
			top-=1;
		}
		return value;
	}
	
	//Display Stack
	void display() {
		for(int i=0; i<=top; i++) {
			System.out.print(data[i]+"\t");
		}
	}
	
	//Main class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack: ");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		for(int i=0; i<size; i++) {
			stack.push(sc.nextInt());
		}
		stack.display();
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		stack.display();
	}
}
