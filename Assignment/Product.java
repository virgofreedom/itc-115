import java.text.NumberFormat;

public class Product {
	private int code;
	private String description;
	private double price;
	private int count = 0;
	// constructors
	public Product(int pcode, String pdesc, double pprice) {
		// TODO Auto-generated constructor stub
		this.code = pcode;
		this.description = pdesc;
		this.price = pprice;
		this.count = this.count + 1;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getDescrtiption() {
		return description;
	}
	
	public String toString() {
		return "("+ code + ", " + description + ", " + price + ")";
	}
	public int getCount() {
		return count;
	}
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
}
