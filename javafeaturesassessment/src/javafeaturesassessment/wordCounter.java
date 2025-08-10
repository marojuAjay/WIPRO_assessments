package javafeaturesassessment;

import java.util.Arrays;
import java.util.List;

public class wordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Hyderabad","Delhi","Mumbai","Kolkata");
		long cout = words.stream().filter(n->n.length() > 5).count();
		System.out.println(cout);
	}

}
