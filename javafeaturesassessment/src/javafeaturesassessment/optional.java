package javafeaturesassessment;
import java.util.*;
public class optional {

	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 20;
		Optional<String> result;
		if(n2 == 0) {
			result = Optional.empty();
		}
		else {
			result = Optional.of("Result: " + (n1/n2));
		}
		result.ifPresentOrElse(
				System.out::println,
				()->System.out.println("Not allowed")
				);
		
	}

}
