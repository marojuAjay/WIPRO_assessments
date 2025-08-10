package Assignments_training;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Grocerylineshuffle {

	 public static void main(String[] args) {
	        ArrayDeque<String> queue = new ArrayDeque<>();

	        // Example: customers join
	        List<String> customers = Arrays.asList("Anna", "Bob", "Charlie", "Dave", "Eva");

	        for (String name : customers) {
	            if (name.length() % 2 == 0) {
	                queue.addFirst(name); // even → front
	            } else {
	                queue.addLast(name);  // odd → end
	            }
	        }

	        System.out.println("Serving order:");
	        while (!queue.isEmpty()) {
	            System.out.println(queue.removeFirst());
	        }
	    }

}
