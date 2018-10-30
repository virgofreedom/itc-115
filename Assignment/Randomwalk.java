import java.util.*;

class Randomwalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomWalk();
	}
	
	public static void randomWalk() {
		Random r = new Random();
		int max = 0;
		int position = 0;
		int curr=0;
		int y = 0;
		while(position > -3 && position < 3) {
			y++;
			int stepF = 1;
			int stepB = -1;
			int step = r.nextBoolean() ? stepF : stepB;
			position += step;
			if (y == 1) {
				curr = position;
			}
			
			if(curr <= position) {
				curr = position;
				max = position;
			}else {
				max = curr;
			}
			System.out.println("Position = " + position);
		}
		System.out.println("Max = " + max);
	}
	
}
