
class Issorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list1 = {1,2,3,4,5,5};
		double[] list2 = {1,1,3,2,4,6,7};
		double[] list3 = {16.1, 12.3, 22.2, 14.4};
		double[] list4 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
		System.out.println(isSorted(list3));
		System.out.println(isSorted(list4));
	}
	public static boolean isSorted(double[] list) {
		int y = list.length - 1;
		for (int i = 0; i < list.length;i++) {
				if (i == y) {
					return true;
				}
				
				if (list[i+1] >= list[i]) {
					
					
				}else {
					return false;
				}
			
			
		}
		return true;
	}
}

