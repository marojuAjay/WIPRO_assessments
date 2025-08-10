package javafeaturesassessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class PrettyJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c_names = Arrays.asList("hyd","del","kol","mum","up");
		String result = c_names.stream().collect(Collectors.joining(", "));
		System.out.println(result);
	}

}
