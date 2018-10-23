
class Printpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOfN(2,7);   
		printPowersOfN(5,3);
		
	}
	
	public static void printPowersOfN(int base, int exponent) {
		String res = "";
		for(int i =0;i<=exponent;i++) {
			int preres = (int) Math.pow(base, i); 
			res += preres + " "; 
		}
		System.out.println(res);
	}
}
