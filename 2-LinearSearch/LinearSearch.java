public class LinearSearch {

	public static void main(String[] args) {
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomValue();
		newArray.printArray();
		System.out.println(newArray.linearSearchForValue(12));
	}
	
	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	public void generateRandomValue() {

		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}
	
	public String linearSearchForValue(int value) {

		boolean valueInArray = false;

		String indexesWithValue = "The Value was Found in the Following index: ";

		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				indexesWithValue += i;
			}
		}

		if (!valueInArray) {
			return "Value was not found.";
		} 
		else return indexesWithValue;
	}
	
	public void printArray() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}
}
