package arrayimplementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayJunit {

	Arrays object = new Arrays(5);
	
	@Test
	public void addTest() {
		object.add("Harry");
		object.add("Harmoine");
		object.add("Ron");
		String temp = object.add("Draco");
		assertEquals("Insert of 'Draco' successful", temp);
	}

	@Test
	public void addItemTest() {
		object.add("Harry");
		object.add("Harmoine");
		object.add("Ron");
		object.add("Draco");
		
		String temp = object.addItem("Ginny", 2);
		assertEquals("Insert of 'Ginny' at position '2' successful", temp);
	}
	
	@Test
	public void arrayFullTest() {
		object.add("Harry");
		object.add("Harmoine");
		object.add("Ron");
		object.add("Draco");
		object.addItem("Ginny", 2);
		
		String temp = object.addItem("George", 3);
		assertEquals("Array is full. No more items can be addded", temp);
	}
	
	@Test
	public void deleteTest() {
		object.add("Harry");
		object.add("Harmoine");
		object.add("Ron");
		object.add("Draco");
		object.addItem("Ginny", 2);
		
		String temp = object.delete(3);
		assertEquals("Delete at index '3' successful", temp);
	}
	
	@Test
	public void printTest() {
		object.add("Harry");
		object.add("Harmoine");
		object.add("Ron");
		object.add("Draco");
		object.addItem("Ginny", 2);
		object.delete(3);
		
		String temp = object.printArray();
		assertEquals("Harry | Harmoine | Ginny | Draco | ", temp);
	}
	
	@Test
	public void lengthTest() {
		object.add("Harry");
		object.add("Harmoine");
		object.add("Ron");
		
		int temp = object.lastIndex();
		assertEquals(2, temp);
	}
	
}
