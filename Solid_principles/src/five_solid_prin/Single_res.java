package five_solid_prin;
class Foodorder{
	String item;
	int quantity;
	public int calculateBill() {
		return quantity * 35;
	}
}
class Bill{
	public void printbill(Foodorder order) {
		System.out.println("item:" + order.item);
		System.out.println("quantity:"+ order.quantity);
		System.out.println("total:" + order.calculateBill());
	}
}
public class Single_res {
	public static void main(String[] args) {
		Foodorder order = new Foodorder();
		order.item = "dosa";
		order.quantity = 5;
		Bill b = new Bill();
		b.printbill(order);
	}

}
