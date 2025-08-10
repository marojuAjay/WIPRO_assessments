package javafeaturesassessment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customchailfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Anita", "Ajay", "Asha", "Kavya", "Aruna", "Bala");
		Predicate<String> startsWithA = name -> name.startsWith("A");
		Predicate<String> endsWitha = n ->n.endsWith("a");
		List<String> filtered = names.stream().filter(startsWithA.and(endsWitha)).collect(Collectors.toList());
		System.out.println(filtered);
	}

}
