package Assignments_training;
import java.util.Scanner;
import java.util.Stack;
public class undostack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> str = new Stack<>();
		System.out.println("enter three names");
		for(int i=0; i<3 ;i++){
			String name = sc.nextLine();
			str.push(name);
			String undoname = str.pop();
			System.out.println("the undo command: " + undoname);
			str.push(undoname);
		}
		for(String i : str) {
			System.out.println(i);
		}
	}

}
