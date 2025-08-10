package javafeaturesassessment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyMapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nam = Arrays.asList("ajay","ajay","siva","siva","arjun","arjun");
		Map<String, Long> fm = nam.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		fm.forEach((name, count)-> System.out.println(name+ " appears" + count + "times"));
		
	}

}
