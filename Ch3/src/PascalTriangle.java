
class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10;i++) {
			if (i == 0) {
				System.out.print(" ");
			}else {
				System.out.printf("%4d", 1);
			}
			
			
			for (int y=0;y<i;y++) {
				System.out.printf("%4d", i);
			}
			System.out.printf("%4d", 1);
			System.out.println();
		}
		
	}
}
