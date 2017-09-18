package queueimplementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueJunit {

	Queues object = new Queues(5);	
	
	@Test
	public void PushTest() {
		String temp = object.push("Senior citizens");
		assertEquals("String 'Senior citizens' pushed successfully", temp);
	}

	@Test
	public void PushExceeded() {
		object.push("Senior citizens");
		object.push("Adult women");
		object.push("Babies");
		object.push("Toddlers");
		object.push("Infants");
		String temp = object.push("Adult men");
		assertEquals("Push limit exceeded", temp);
	}
	
	@Test
	public void PopTest() { 
		object.push("Senior citizens");
		object.push("Adult women");
		object.push("Babies");
		object.push("Toddlers");
		object.push("Infants");
		
		String temp = object.pop();
		assertEquals("Item popped: Senior citizens", temp);
	}
	
	@Test
	public void PopExceeded() { 
		object.push("Senior citizens");
		object.push("Adult women");
		
		object.pop();
		object.pop();
		
		String temp = object.pop();
		assertEquals("Pop limit exceeded. Queue is empty", temp);
	}
	
	@Test
	public void PrintQueue() { 
		object.push("Senior citizens");
		object.push("Adult women");
		object.push("Babies");
		object.push("Toddlers");
		object.push("Infants");
		
		String temp = object.printQueue();
		assertEquals("Senior citizens | Adult women | Babies | Toddlers | Infants | ", temp);
	}
}
