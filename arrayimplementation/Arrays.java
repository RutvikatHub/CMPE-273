package arrayimplementation;

public class Arrays {

	private int arraySize;
	private int index;
	private String[] arraySet;
	private String arrayString;
 	
	//defining the constructor
	public Arrays(int size) {
		arraySize = size;
		index = 0;
		arraySet = new String[arraySize];
		arrayString = "";
	}
	
	//identify the last index position
	public int lastIndex() {
		for (int i = 0; i < arraySize; i++) {
			if (arraySet[i] != null) {
				index = i;
			}
		}
		return index;
	}
	
	//adding an item at terminal
	public String add(String s) {
		if (lastIndex() == arraySize - 1) {
			return "Array is full. No more items can be addde";
		}
		else {
			for(int i = 0; i < arraySize; i++) {
				if (arraySet[i] == null) {
					arraySet[i] = s;
					index = i;
					break;
				}
			}
			return "Insert of '" + arraySet[index] + "' successful";
		}
	}
	
	//adding an item at specific position
	public String addItem(String s, int position) {
		if (lastIndex() == arraySize - 1) {
			return "Array is full. No more items can be addded";
		}
		else {
			for (int i = arraySize - 1; i >= position; i--) {
				if (arraySet[i] != null) {
					arraySet[i+1] = arraySet[i];
				}
			}
			arraySet[position] = s;
			return "Insert of '" + s +"' at position '" + position + "' successful";
		}
	}
	
	//deleting an item from specific position
	public String delete(int position) {
		if (position < arraySize) {
			for (int i = position; i < arraySize - 1; i++) {
				arraySet[i] = arraySet[i+1];
				arraySet[i+1] = null;
			}
			return "Delete at index '" + position + "' successful";
		}
		else {
			return "Invalid position";
		}
	}
	
	//printing an array
	public String printArray() {
		arrayString = "";
		if (arraySet[0] == null) {
			return "Array is empty";
		}
		else {
			for(int i = 0; i < arraySize; i++) {
				if(arraySet[i] != null) {
					arrayString += arraySet[i] + " | ";
				}
				else
					break;
			}
			return arrayString;
		}
	}
	
	public static void main(String[] args) {
		Arrays temp = new Arrays(5);

		System.out.println(temp.add("Harry"));
		System.out.println(temp.add("Harmoine"));
		System.out.println(temp.add("Ron"));
		System.out.println(temp.add("Draco"));
		System.out.println(temp.printArray());
		
		System.out.println(temp.addItem("Ginny", 2));
		System.out.println(temp.printArray());
		
		System.out.println(temp.addItem("George", 3));
		System.out.println(temp.printArray());
		
		System.out.println(temp.delete(3));
		System.out.println(temp.printArray());
		
		System.out.println("The last item is at index: " + temp.lastIndex());
	}

}
