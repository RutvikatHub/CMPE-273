package queueimplementation;

public class Queues {
	
	private String[] queueArray;
	private String queueString;
	private int front;
	private int rear;
	private int queueSize;
	
	public Queues(int size) {
		queueSize = size;
		queueString = "";
		front = -1;
		rear = -1;
		queueArray = new String[queueSize];
	}
	
	public String push(String s) {
		if (front + 1 >= queueSize) {
			return "Push limit exceeded";
		}
		else {
			queueArray[++front] = s;
			return "String '" + s +"' pushed successfully";
		}
	}
	
	public String pop() {
		if (front <= rear) {
			return "Pop limit exceeded. Queue is empty";
		}
		else {
			return "Item popped: " + queueArray[++rear];
		}
	}
	
	public String printQueue() {
		queueString = "";
		for (int i=rear+1; i<= front; i++) {
			queueString += queueArray[i] + " | ";
		}
		return queueString;
	}
	
	
	public static void main(String[] args) {		
		
		Queues object = new Queues(5);
		
		object.push("Senior citizens");
		object.push("Adult women");
		object.push("Babies");
		object.push("Toddlers");
		object.push("Infants");
		object.push("Adult men");
		System.out.println(object.printQueue());
	}
}
