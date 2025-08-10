package javafeaturesassessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Namesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ravi", "Ajay", "Kiran", "Sita", "Bhanu");
		names.sort((name1,name2)->name1.compareTo(name2)); 
		for(String n : names) {
			System.out.println(n);
		}
	}

}
