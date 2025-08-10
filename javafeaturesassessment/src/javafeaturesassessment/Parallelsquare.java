package javafeaturesassessment;

import java.util.Arrays;
import java.util.List;

public class Parallelsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(2,3,4,5);
		values.parallelStream().forEach(n->System.out.println(Thread.currentThread().getName() + " -> " + n*n));
	}

}
