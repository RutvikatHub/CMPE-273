package stackimplementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackJunit {

	Stacks object = new Stacks(5);
	
	@Test
	public void PushTest() {
		String temp = object.push("Engine");
		assertEquals("String 'Engine' pushed successfully", temp);
	}

	@Test
	public void PushExceeded() {
		object.push("Engine");
		object.push("AC 1 Tier");
		object.push("AC 2 Tier");
		object.push("AC 3 Tier");
		object.push("General");
		
		String temp = object.push("Pantry Car");
		assertEquals("Push limit exceeded", temp);
	}
	
	@Test
	public void PopTest() { 
		object.push("Engine");
		object.push("AC 1 Tier");
		object.push("AC 2 Tier");
		object.push("AC 3 Tier");
		object.push("General");
		
		String temp = object.pop();
		assertEquals("Item popped: General", temp);
	}
	
	@Test
	public void PopExceeded() { 
		object.push("Engine");
		object.push("AC 1 Tier");
			
		object.pop();
		object.pop();
		
		String temp = object.pop();
		assertEquals("Pop limit exceeded. Queue is empty", temp);
	}
	
	@Test
	public void PrintStack() { 
		object.push("Engine");
		object.push("AC 1 Tier");
		object.push("AC 2 Tier");
		object.push("AC 3 Tier");
		object.push("General");
		
		String temp = object.printStack();
		assertEquals("Engine | AC 1 Tier | AC 2 Tier | AC 3 Tier | General | ", temp);
	}
}
