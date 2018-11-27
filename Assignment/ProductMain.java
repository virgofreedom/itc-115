

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product (1,"This is my first procdut",2);
		Product p2 = new Product (2,"My second product is bigger",5);
		Product p3 = new Product (3,"An awsome our third product",6);
		System.out.println(p1.getCode());
		System.out.println(p2.getPriceFormatted());
		System.out.println(p3.getPriceFormatted());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p1.getCode());
		System.out.println(p2.getCode());
		System.out.println(p3.getCode());
	}

}
