package derek.banas.algorithms.array_structures;

public class ArrayStructures {

	private int[] theArray = new int[50];
	private int arraySize = 10;

	public void generateRandomValue() {

		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printArray() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}

	public void printIndex(int index) {

		for (int i = 0; i < arraySize; i++) {
			if (i == index) {
				System.out.println(theArray[i - 1]);
			}
		}
	}

	public void isIndexInArray(int index) {

		boolean isIntInTheArray = false;

		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == index) {
				System.out.println("The array contains the number: " + theArray[i]);
				isIntInTheArray = true;
				break;
			}
		}

		if (!isIntInTheArray) {
			System.out.println("The number " + index + " is not in the array.");
		}
	}

	public void deleteIndex(int index) {
		// Check if the index is between in the allowed range
		if (index < arraySize) {
			for (int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	public void addIndex(int index) {

		if (arraySize < 50) {
			theArray[arraySize] = index;
			arraySize++;
		}
	}

	public String linearSearchForValue(int value) {

		boolean valueInArray = false;

		String indexesWithValue = "The Value was Found in the Following index: ";

		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				indexesWithValue += i + " ";
			}
		}

		if (!valueInArray) {
			return "Value was not found.";
		} 
		else return indexesWithValue;
	}

	public static void main(String[] args) {
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomValue();
		newArray.printArray();
		newArray.printIndex(5);
		newArray.isIndexInArray(14);
		newArray.deleteIndex(4);
		newArray.printArray();
		newArray.addIndex(11);
		newArray.printArray();
		System.out.println(newArray.linearSearchForValue(12));
	}
}
