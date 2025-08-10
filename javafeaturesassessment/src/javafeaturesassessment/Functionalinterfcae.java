package javafeaturesassessment;
@FunctionalInterface
interface MessagePrinter{
	void printMessage();
}
class Greetings {
	public void greet(MessagePrinter p) {
		p.printMessage();
	}
}
public class Functionalinterfcae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessagePrinter mp =()-> System.out.println("Good Evening");
		mp.printMessage();
	}

}
