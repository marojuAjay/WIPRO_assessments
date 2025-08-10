package Assignments_training;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
public class reverse_task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<String> tasks = new LinkedList<>();
		System.out.println("Enter the tasks:");
		for(int i=0;i<n;i++) {
			String task = sc.nextLine();
			if(task.endsWith("!")) {
				tasks.addFirst(task);
			}
			else {
				tasks.addLast(task);
			}
		}
		Collections.reverse(tasks);
		for(String i : tasks) {
			System.out.println(i);
		}
		
	}

}
