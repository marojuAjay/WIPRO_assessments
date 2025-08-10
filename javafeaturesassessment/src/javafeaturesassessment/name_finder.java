package javafeaturesassessment;

import java.util.Arrays;
import java.util.List;

public class name_finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ajay","aura","abhi","akash","bhanu","bharath");
		names.stream().filter(n ->n.toLowerCase().startsWith("a")).forEach(System.out::println);
		
	}

}
