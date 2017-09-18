package collectionimplementation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void objectCollectionTest() {
		String temp = "";
		ArrayList<ArrayListClass> object = new ArrayList<ArrayListClass>();
		object.add(new ArrayListClass("San Jose State", "San Jose", "Software Engineering"));
		
		//Using for-each loop to traverse the object collection	
		for(ArrayListClass a:object) {
			temp = a.universityName + " - " + a.location + " - " + a.major;
		}
		assertEquals("San Jose State - San Jose - Software Engineering", temp);
	}
	
	@Test
	public void stringCollectionTest() {
		String temp = "";
		ArrayList<String> object = new ArrayList<String>();
		object.add("MIT");
		object.add("Harvard");
		object.add("Stanford");
		
		object.remove(2);
		
		//Using an iterator to traverse the string collection
		Iterator i = object.iterator();
		
		while(i.hasNext()) {
			temp += i.next() + " ";
		}
		
		assertEquals("MIT Harvard ", temp);
	}
	
	@Test
	public void lastIndexTest() {
		ArrayList<String> object = new ArrayList<String>();
		object.add("MIT");
		object.add("Harvard");
		object.add("Stanford");
		
		assertEquals(1, object.lastIndexOf("Harvard"));
	}
	
	@Test
	public void getIndexTest() {
		ArrayList<String> object = new ArrayList<String>();
		object.add("MIT");
		object.add("Harvard");
		object.add("Stanford");
		
		assertEquals(2, object.indexOf("Stanford"));
	}
	
	@Test
	public void cloneCopyTest() {
		ArrayList<String> object = new ArrayList<String>();
		object.add("MIT");
		object.add("Harvard");
		object.add("Stanford");
		
		ArrayList<String> copy = (ArrayList<String>) object.clone();
		
		assertEquals(copy, object);
	}
}
