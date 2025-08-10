package javafeaturesassessment;
interface power{
	void show();
	
	default public void Status() {
		System.out.println("i am the default method");
	}
}
class example implements power{
	public void show() {
		System.out.println("I am the abstract method");
	}
}

public class Defaultme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new example();
		e.show();
		e.Status();

	}

}
