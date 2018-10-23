
class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(season(12,11));
		System.out.println(season(12,31));
		System.out.println(season(7,21));
		System.out.println(season(5,19));
		System.out.println(season(13,21));
		System.out.println(season(3,32));
	}
	public static String season(int month, int day) {
		String result = "";
		// return error message if user entry the wrong day and month
		if(month > 12) {
			return result = "Please enter between 1 to 12 for month";
		}
		if(day > 31) {
			return result = "Please enter between 1 to 31 for day";
		}
		//Winter
		if(month == 12 && day > 15) {
			result = "winter";
		}else if (month < 3) {
			result = "winter";
		}else if(month == 3 && day <16){
			result = "winter";
		}else if(month == 3 && day > 15) {//Spring
			result = "spring";
		}else if(month > 3 && month < 6) {
			result = "spring";
		}else if(month == 6 && day < 16) {
			result = "spring";
		}else if(month == 6 && day > 15) {//Summer
			result = "summer";
		}else if(month > 6 && month < 9) {
			result = "summer";
		}else if(month == 9 && day < 16) {
			result = "summer";
		}else if(month == 9 && day > 15) {//Fall
			result = "fall";
		}else if(month > 9 && month < 12) {
			result = "fall";
		}else if(month == 12 && day < 16) {
			result = "fall";
		}
		

		return result;
	}
}
