package xavier;
import java.util.Scanner;

public class NameReorder {


	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a name containing three words
	        System.out.print("Enter a name containing three words: ");
	        String name = scanner.nextLine();

	        // Display the name with the surname first
	        String reorderedName = reorderName(name);
	        System.out.println("Reordered name: " + reorderedName);

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to reorder the name with the surname first
	    public static String reorderName(String name) {
	        // Split the name into three words using whitespace as delimiter
	        String[] words = name.split("\\s+");

	        // Check if the input contains three words
	        if (words.length != 3) {
	            return "Invalid input. Please enter a name containing three words.";
	        }

	        // Reorder the words to display the surname first
	        String reorderedName = words[2] + " " + words[0] + " " + words[1];

	        return reorderedName;
	    }
	

}
