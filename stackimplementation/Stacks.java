package stackimplementation;

public class Stacks {

	private String[] stackArray;
	private String stackString;
	private int front;
	private int rear;
	private int stackSize;
	
	public Stacks(int size) {
		stackSize = size;
		stackString = "";
		front = -1;
		rear = -1;
		stackArray = new String[stackSize];
	}
	
	public String push(String s) {
		if(front + 1 >= stackSize) {
			return "Push limit exceeded";
		}
		else {
			stackArray[++front] = s;
			return "String '" + s +"' pushed successfully";
		}
	}
	
	public String pop() {
		if (front <= rear) {
			return "Pop limit exceeded. Queue is empty";
		}
		else {
			return "Item popped: " + stackArray[front--];
		}
	}
	
	public String printStack() {
		stackString = "";
		for (int i=rear+1; i<= front; i++) {
			stackString += stackArray[i] + " | ";
		}
		return stackString;
	}
	
	public static void main(String[] args) {
		Stacks stackArray = new Stacks(5);
		stackArray.push("Engine");
		stackArray.push("AC 1 Tier");
		stackArray.push("AC 2 Tier");
		stackArray.push("AC 3 Tier");
		stackArray.push("General");
		
		System.out.println(stackArray.printStack());
		
		System.out.println(stackArray.push("Pantry Car"));
		
	}

}
