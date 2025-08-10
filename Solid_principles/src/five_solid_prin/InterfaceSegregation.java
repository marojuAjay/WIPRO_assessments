package five_solid_prin;
interface workable{
	void work();
}
interface Eatable{
	void eat();
}
class Human implements workable, Eatable{
	public void work() {
		System.out.println("Human is working");
	}
	public void eat() {
		System.out.println("Human is eating");
	}
}
class Robot implements workable {
    public void work() {
        System.out.println("Robot is working");
    }
}
public class InterfaceSegregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		h.work();
		h.eat();
		Robot r = new Robot();
		r.work();

	}

}
