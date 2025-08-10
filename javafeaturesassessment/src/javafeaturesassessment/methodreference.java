
package javafeaturesassessment;
import java.util.*;

public class methodreference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi", "ajay", "Kiran", "Bala");

		        // Sort using method reference (case-insensitive)
		names.sort(String::compareToIgnoreCase);

		System.out.println("Sorted names: " + names);
		    }
		}

