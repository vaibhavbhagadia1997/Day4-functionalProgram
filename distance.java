package day5a;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		//computation
		double dist = Math.sqrt(Math.pow(x, 2) + Math.pow (y,2));
		System.out.println("distance from (" + x + ", " + y + ") to (0,0) = " + dist);
	}

}
