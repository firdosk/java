package xavier;
import java.util.Scanner;
public class Strings {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an array to store 10 strings
	        String[] strings = new String[10];

	        // Accept 10 strings from the user
	        System.out.println("Enter 10 strings:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter string " + (i + 1) + ": ");
	            strings[i] = scanner.nextLine();
	        }

	        // Display the strings from the array using an enhanced for loop
	        System.out.println("\nStrings entered:");
	        int count = 1;
	        for (String str : strings) {
	            System.out.println(count + ": " + str);
	            count++;
	        }

	        scanner.close();
	    }
	}
