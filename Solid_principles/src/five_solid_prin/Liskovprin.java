package five_solid_prin;
class Transport{
	void move() {
		System.out.println("It can move");
	}
}
interface Flyable{
	void fly();
}
class car extends Transport{
	
}
class Airplane extends Transport implements Flyable{
	public void fly() {
		System.out.println("Airplane is flying");
	}
}
public class Liskovprin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport t = new car();
		t.move();
		Transport t2 = new Airplane();
		t2.move();
		Flyable f = new Airplane();
		f.fly();
		

	}

}
