
class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr = 1;
		int prev = 1;
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(curr);
			curr = curr + prev;
			prev = curr - prev;

		}
	}

}
