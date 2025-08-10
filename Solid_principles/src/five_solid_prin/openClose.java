package five_solid_prin;
interface PaymentMethod{
	void pay();
}
class creditCard implements PaymentMethod{
	public void pay() {
		System.out.println("paid using credit card");
	}
}
class upiPayments implements PaymentMethod{
	public void pay() {
		System.out.println("paid using upi mode");
	}
}
class Decider{
	void process(PaymentMethod method) {
		method.pay();
	}
}
public class openClose {

	public static void main(String[] args) {
		Decider d = new Decider();
		d.process(new creditCard());
		d.process(new upiPayments());
	}

}
