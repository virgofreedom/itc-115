
import java.util.*;

class Makeguesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeGuesses();
	}
	public static void makeGuesses() {
		Random r = new Random();
	    int total = 0;
	    int result = -1; // set to –1 to make sure we enter the loop
	    while(result < 48) {
	    	   
	    	result = r.nextInt(50) + 1; // random number from 1–50
	    	//print a report each guess	 
	    	System.out.println("guess = " + result);
	    	total++; // count the total guesses
	    }
	    //print report total number of guesses
	    System.out.println("total guesses  = " + total);
	}
	
}
