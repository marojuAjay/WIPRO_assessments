package Assignments_training;
import java.util.Scanner;
import java.util.ArrayDeque;
public class lastsearches {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> searcHistory = new ArrayDeque<>();
		for(int i=0;i<5;i++) {
			String term = sc.nextLine();
			if(searcHistory.size() == 3) {
				searcHistory.removeFirst();
			}
			searcHistory.addLast(term);
		}
		for(String i: searcHistory) {
			System.out.println(i);
		}
	}

}
